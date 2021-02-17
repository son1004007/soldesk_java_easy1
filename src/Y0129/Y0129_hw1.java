package Y0129;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//숙제 덧셈 계산기 
//텍스트필드2개 입력 : 1+2 출력: 3
//그리드 4행 4열
//연산자는 색 표시
//getText, setText 
//마우스로 클릭

public class Y0129_hw1 extends JFrame {
	Y0129_hw1(){
		setTitle("덧셈 계산기");
		Container c = getContentPane();
		this.setLayout(new FlowLayout());
		
		JTextField j1 = new JTextField(10);
		JTextField j2 = new JTextField(10);
		JButton j3 = new JButton("더하기");
		JTextArea j4 = new JTextArea(10, 30);
		
		add(j1);
		add(j2);
		add(j3);
		add(j4);
		
		j3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1 = j1.getText();
				int a1 = Integer.parseInt(str1);
				String str2 = j2.getText();
				int a2 = Integer.parseInt(str2);
				Integer i1 = a1+a2;
				String str3 = i1.toString();
				j4.setText(str3);
			}
		});
		
		setVisible(true);
		setSize(400,300);
	}

	
	public static void main(String[] args)  {
		new Y0129_hw1();
	}

}
