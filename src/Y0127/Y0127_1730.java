package Y0127;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
// 2021-01-27 과제
// 체크박스 체크하면, 라디오버튼 활성화
// 라디오버튼 선택하면, 무언갈 출력?
// 28일까지.

//2. "공부 선택"이라는 체크박스 하나, "Java", "Python", "C#"이라는 라디오 버튼 세개를 만들어
//"공부선택"만 활성화하고 라디오 버튼 세개는 비활성화로 초기화한다.
//"공부선택"을 체크하면 라디오 버튼 세개가 활성화 된다.
//그 상태에서 
//"Java"를 누르면 "자바!!" "Python"누르면 "파이썬!!", "C#"을 누르면 "C#!!"이라고 출력한다.

import javax.swing.JFrame;
import javax.swing.JRadioButton;


public class Y0127_1730{
	
	
	Y0127_1730(){
		JFrame f = new JFrame();
		
		f.setLayout(new FlowLayout());
		
		JCheckBox c0 = new JCheckBox("공부 선택");
		f.add(c0);
		
		JRadioButton rdo1 = new JRadioButton("Java");
		JRadioButton rdo2 = new JRadioButton("Python");
		JRadioButton rdo3 = new JRadioButton("C#");
		
		
		f.add(rdo1);
		f.add(rdo2);
		f.add(rdo3);
		
		
		ButtonGroup b1 = new ButtonGroup();
		b1.add(rdo1);
		b1.add(rdo2);
		b1.add(rdo3);
		
		rdo1.setEnabled(false);
		rdo2.setEnabled(false);
		rdo3.setEnabled(false);
		
		c0.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					System.out.println("공부 선택");
					rdo1.setEnabled(true);
					rdo2.setEnabled(true);
					rdo3.setEnabled(true);
				}
			}
		});
		
		rdo1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Java");
			}
		});
		
		rdo2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Python");
			}
		});
		rdo3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("C#");
			}
		});
		
		f.setVisible(true);
		f.setSize(512,256);
		
	}
	

	public static void main(String[] args) {
		new Y0127_1730();
	}
}

