package portfolio;
//https://stronglifts.com/5x5/#gref
//https://youtu.be/_6pXI2pgr8g

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;


// 0. 실행시키면 최근 저장된 운동 내용을 불러온다.
//출력 내용 : 저장된 날짜 / 루틴 A,B / 운동 이름(1,2,3) / 중량 / 횟수 / 세트
//public class InputStreamEx {
//	try {
//		File fileload = new File("C:/Stronglift/StrongLift_save.txt");
//		FileReader file_reader = new FileReader(fileload);
//		int cur = 0;
//		while ((cur = file_reader.read()) != -1) {
//			System.out.print((char) cur);
//		}
//		file_reader.close();
//	}catch(FileNotFoundException e1) {e1.getStackTrace();}
//	catch(IOException e){e1.getStackTrace();}
//}

public class Stronglift {
    
    JFrame frame = new JFrame("StrongLift 5x5");
    JRadioButton rdoA = new JRadioButton("RoutineA");
    JRadioButton rdoB = new JRadioButton("RoutineB");
    ButtonGroup buttongroup = new ButtonGroup();
    
  //루틴 A, 루틴 B 생성
    String[] routineA = {"Squat","Bench Press","Barbell Row"}; 
    String[] routineB = {"Squat","Oh Press","Deadlift"};
    
    JButton rtAbttn[] = new JButton[routineA.length];
    JButton rtBbttn[] = new JButton[routineB.length];
    
    ImageIcon[] rtAimage = {
    		new ImageIcon("C:/Stronglift/squat2.png"),
    		new ImageIcon("C:/Stronglift/benchpress2.png"),
    		new ImageIcon("C:/Stronglift/barbellrow2.png")
    };
    
    ImageIcon[] rtBimage = {
    		new ImageIcon("C:/Stronglift/squat2.png"),
    		new ImageIcon("C:/Stronglift/Oh Press2.jpg"),
    		new ImageIcon("C:/Stronglift/Deadlift2.png")
    };
    
    Button minusBtA[] = new Button[routineA.length];
	Button plusBtA[] = new Button[routineA.length];
	TextField countA[] = new TextField[routineA.length];
	
	Button minusBtB[] = new Button[routineB.length];
	Button plusBtB[] = new Button[routineB.length];
	TextField countB[] = new TextField[routineB.length];
	
	int count = 5;
	String show = "";
    
 // 2. 날짜 표시
    SimpleDateFormat date = new SimpleDateFormat ("yyyy년 MM월 dd일");
    Calendar time = Calendar.getInstance();
    String time1 = date.format(time.getTime());
    Label today = new Label("날짜 : "+time1);
    TextArea textArea = new TextArea("", 0, 0, 0);
    
	Stronglift(){
		
		// 0. 저장 파일 불러 와서 출력 : 
		// 날짜 / 루틴 A,B / 운동 이름1( 중량 : 횟수 : 세트 ) / 운동 이름2( 중량 : 횟수 : 세트 ) / 운동 이름3( 중량 : 횟수 : 세트 )
		
	    try{
	    	File file = new File("C:/Stronglift/StrongLift_save.txt");

	        FileReader fileReader = new FileReader(file);
	        BufferedReader bufReader = new BufferedReader(fileReader);
	        String line="", last="";
	        while((line = bufReader.readLine()) != null){
	        	System.out.println(line);
	        	last = line;
            }

	        Label load = new Label("이전 내용 : "+last);
	        load.setBounds(30, 10, 500, 50);
	        frame.add(load);
	        
	    }catch (FileNotFoundException e) {
	        // TODO: handle exception
	    }catch(IOException e){
	        System.out.println(e);
	    }
	    
//        today.setBounds(30, 30, 500, 30);
//        frame.add(today);
        
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setBounds(0,0, 600, 1000);
        
        //1. 라디오 버튼으로 routineA와 routineB 중 1개만 선택한다.
        //단,  Squat / Bench Press / Barbell Row / Oh Press / Deadlift 는 
        //기본 비활성 상태이고, routine을 선택하면 표시된다.
        rdoA.setBounds(30, 150, 100, 40);
        rdoB.setBounds(300, 150, 100, 40);
        frame.add(rdoA);
        frame.add(rdoB);
        
        rdoA.addItemListener(new RoutineChoice());
        rdoB.addItemListener(new RoutineChoice());
        
        buttongroup.add(rdoA);
        buttongroup.add(rdoB);
        
        
        for (int i = 0; i < routineA.length; i++) {
			rtAbttn[i] = new JButton(routineA[i], rtAimage[i]);
			rtAbttn[i].setBounds(30, 200 + (i * 130), 150, 100);
			frame.add(rtAbttn[i]);
			rtAbttn[i].setEnabled(false);
			
			plusBtA[i] = new Button("+");
			frame.add(plusBtA[i]);
			plusBtA[i].setBounds(200, 200 + (i * 130), 20, 20);
			plusBtA[i].setEnabled(false);
			
			
			countA[i] = new TextField("5");
			countA[i].setBounds(200, 240 + (i * 130), 20, 20);
			frame.add(countA[i]);
			countA[i].setEnabled(false);
			
			
			minusBtA[i] = new Button("-");
			minusBtA[i].setBounds(200, 280 + (i * 130), 20, 20);
			frame.add(minusBtA[i]);
			minusBtA[i].setEnabled(false);
			
		}
        
        for (int i = 0; i < routineB.length; i++) {
			rtBbttn[i] = new JButton(routineB[i], rtBimage[i]);
			rtBbttn[i].setBounds(300, 200 + (i * 130), 150, 100);
			frame.add(rtBbttn[i]);
			rtBbttn[i].setEnabled(false);
			
			plusBtB[i] = new Button("+");
			frame.add(plusBtB[i]);
			plusBtB[i].setBounds(470, 200 + (i * 130), 20, 20);
			plusBtB[i].setEnabled(false);
			
			
			countB[i] = new TextField("5");
			countB[i].setBounds(470, 240 + (i * 130), 20, 20);
			frame.add(countB[i]);
			countB[i].setEnabled(false);
			
			minusBtB[i] = new Button("-");
			minusBtB[i].setBounds(470, 280 + (i * 130), 20, 20);
			frame.add(minusBtB[i]);
			minusBtB[i].setEnabled(false);
		}
        
        
        textArea.setText("날짜		운동명		횟수	세트	성공여부\n\n");
        textArea.setBounds(30, 600, 460, 200);
        textArea.setBackground(Color.white);
        textArea.setEditable(false);
        frame.add(textArea);
        
        
        Button saveBt = new Button("저장");
        saveBt.setBounds(30, 820, 50, 30);
        frame.add(saveBt);
        saveBt.setEnabled(true);
        
        
        
//        FileWriter save = new FileWriter("StrongLift_save.txt"); // 파일에 쓰기
	}

	class RoutineChoice implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.DESELECTED) {
				for (int i = 0; i < routineA.length; i++) {
					rtAbttn[i].setEnabled(false);
					plusBtA[i].setEnabled(false);
					minusBtA[i].setEnabled(false);
					countA[i].setEnabled(false);
					
				}
				for (int i = 0; i < routineB.length; i++) {
					rtBbttn[i].setEnabled(false);
					plusBtB[i].setEnabled(false);
					minusBtB[i].setEnabled(false);
					countB[i].setEnabled(false);
				}
			}
			
			if (rdoA.isSelected()) {
				// rdoA 선택 액션
				// 루틴A 버튼 출력 : Squat / Bench Press / Barbell Row 를 표시한다.
				for (int i = 0; i < routineA.length; i++) {
					rtAbttn[i].setEnabled(true);
					plusBtA[i].setEnabled(true);
					minusBtA[i].setEnabled(true);
					countA[i].setEnabled(true);
					
					int j=i;
					
					// 빼기 :
					minusBtA[i].addActionListener(new ActionListener() {
		            	
		                @Override
		                public void actionPerformed(ActionEvent e) {
							if (count > 0) {
								count = count - 1;
								countA[j].setText(count + "");
							}
		                }
		            });
					// 더하기
		            plusBtA[i].addActionListener(new ActionListener() {
		            	
		                @Override
		                public void actionPerformed(ActionEvent e) {
		                	if(count < 5 ) {
		                		count = count + 1;
			                    countA[j].setText(count + "");
							} 
		                    
		                }
		            });
					
					// 운동 버튼 이벤트
		            rtAbttn[i].addActionListener(new ActionListener() {
		            	 
		                @Override
		                public void actionPerformed(ActionEvent e) {
		                	minusBtA[j].setEnabled(false);
		                	plusBtA[j].setEnabled(false);
		                	rtAbttn[j].setEnabled(false);
		                	show = rtAbttn[j].getActionCommand();
//		                	textArea.setText("날짜		운동명		횟수	성공여부\n\n");
		                	textArea.append(time1+"	" + routineA[j] +  "		" + count + "	 ");
		                }
		            });
					
					
					
				}
			}

			else if (rdoB.isSelected()) {
				// rdoB 선택 액션
				// 루틴B 버튼 출력 : Squat / Oh Press / Deadlift 를 표시하고
				for (int i = 0; i < routineB.length; i++) {
					rtBbttn[i].setEnabled(true);
					plusBtB[i].setEnabled(true);
					minusBtB[i].setEnabled(true);
					countB[i].setEnabled(true);
				}
			}
		}
	}

	public static void main(String[] args) {
		new Stronglift();
	}
}
