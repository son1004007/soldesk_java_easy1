package portfolio;
//https://stronglifts.com/5x5/#gref
//https://youtu.be/_6pXI2pgr8g

import java.awt.Color;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Stronglift {
	JFrame frame = new JFrame("StrongLift 5x5");
	
	// 0. 날짜 표시
    SimpleDateFormat date = new SimpleDateFormat ("yyyy년 MM월 dd일");
    Calendar time = Calendar.getInstance();
    String time1 = date.format(time.getTime());
    Label today = new Label("날짜 : "+time1);
    
    JRadioButton rdoA = new JRadioButton("RoutineA");
    JRadioButton rdoB = new JRadioButton("RoutineB");
    ButtonGroup buttongroup = new ButtonGroup();
    
  //루틴 A, 루틴 B 생성
    String[] routineA = {"Squat","Bench Press","Barbell Row"}; 
    String[] routineB = {"Squat","Oh Press","Deadlift"};
    
    JButton rtAbttn[] = new JButton[routineA.length];
    JButton rtBbttn[] = new JButton[routineB.length];
    
    ImageIcon[] rtAimage = {
    		new ImageIcon("C:/Users/son10/Pictures/Stronglift/squat.png"),
    		new ImageIcon("C:/Users/son10/Pictures/Stronglift/benchpress.png"),
    		new ImageIcon("C:/Users/son10/Pictures/Stronglift/barbellrow.png")
    };
    
    ImageIcon[] rtBimage = {
    		new ImageIcon("C:/Users/son10/Pictures/Stronglift/squat.png"),
    		new ImageIcon("C:/Users/son10/Pictures/Stronglift/Oh Press.jfif"),
    		new ImageIcon("C:/Users/son10/Pictures/Stronglift/Deadlift.png")
    };
    
	Stronglift(){
		// 디자인
		// 프레임
		
        frame.setBounds(0, 0, 625, 1000);
        frame.setBackground(Color.black);
        today.setBounds(30, 30, 500, 30);
        frame.add(today);
        
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setBounds(0,0, 500, 1000);
        
        //1. 라디오 버튼으로 routineA와 routineB 중 1개만 선택한다.
        //단,  Squat / Bench Press / Barbell Row / Oh Press / Deadlift 는 
        //기본 비활성 상태이고, routine을 선택하면 표시된다.
        rdoA.setBounds(30, 50, 100, 40);
        rdoB.setBounds(220, 50, 100, 40);
        frame.add(rdoA);
        frame.add(rdoB);
        
        rdoA.addItemListener(new RadioListener());
        rdoB.addItemListener(new RadioListener());
        
        buttongroup.add(rdoA);
        buttongroup.add(rdoB);
        
        
        
        
        
        
        
        
       
	}

	class RadioListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.DESELECTED) {
				return; // 라디오버튼이 선택 해제된 경우 그냥 리턴
			}
			
			if (rdoA.isSelected()) {
				// rdoA 선택 액션
				// 루틴A 버튼 출력 : Squat / Bench Press / Barbell Row 를 표시한다.
				for (int i = 0; i < routineA.length; i++) {
					rtAbttn[i] = new JButton(routineA[i], rtAimage[i]);
					rtAbttn[i].setBounds(30, 200 + (i * 130), 150, 100);
					frame.add(rtAbttn[i]);
					
					
				}
				
			}

			else if (rdoB.isSelected()) {
				// rdoB 선택 액션
				// 루틴B 버튼 출력 : Squat / Oh Press / Deadlift 를 표시하고
				for (int i = 0; i < routineB.length; i++) {
					rtBbttn[i] = new JButton(routineB[i], rtBimage[i]);
					rtBbttn[i].setBounds(300, 200 + (i * 130), 150, 100);
					frame.add(rtBbttn[i]);
				}
			}

		}
	}

	public static void main(String[] args) {
		new Stronglift();
	}
}
