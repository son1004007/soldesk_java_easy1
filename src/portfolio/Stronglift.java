package portfolio;
//https://stronglifts.com/5x5/#gref
//https://youtu.be/_6pXI2pgr8g

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Stronglift {
	Stronglift(){
		// 디자인
		// 프레임
		JFrame frame = new JFrame("StrongLift 5x5");
        frame.setBounds(0, 0, 625, 1000);
        frame.setBackground(Color.black);
        
        JRadioButton rdoA = new JRadioButton("RoutineA");
        JRadioButton rdoB = new JRadioButton("RoutineB");
        rdoA.setBounds(10, 10, 100, 40);
        rdoB.setBounds(200, 10, 100, 40);
        frame.add(rdoA);
        frame.add(rdoB);
        
        ButtonGroup buttongroup = new ButtonGroup();
        buttongroup.add(rdoA);
        buttongroup.add(rdoB);
        
//        frame.setLayout(new FlowLayout());
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setBounds(0,0, 500, 1000);
//        frame.setSize(512,256);
        
        
        String[] routineA = {"Squat","Bench Press","Barbell Row"}; 
        String[] routineB = {"Squat","Oh Press","Deadlift"};
        
        JButton rtAbttn[] = new JButton[routineA.length];
        JButton rtBbttn[] = new JButton[routineB.length];
        ImageIcon[] rtA = {
        		new ImageIcon("C:/Users/son10/Pictures/Stronglift/squat.png"),
        		new ImageIcon("C:/Users/son10/Pictures/Stronglift/benchpress.png"),
        		new ImageIcon("C:/Users/son10/Pictures/Stronglift/barbellrow.png")
        };
        
        // 루틴 버튼
        for(int i=0; i<routineA.length;i++) {
        	
        	rtAbttn[i] = new JButton(routineA[i], rtA[i]);
        	rtAbttn[i].setBounds(30, 100+(i*130), 150, 100);
        	frame.add(rtAbttn[i]);
        }
	}

	public static void main(String[] args) {
		new Stronglift();
	}
}
