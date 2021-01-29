package Y0128;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


//제목 frame
//버튼 Cal
//버튼옆에 계산 출력
//
//버튼 누르면 새창 띄우기
//Jdialog

//두 수를 더합니다. (입력 창)
//(출력창) ADD 버튼
//새창에서 ADD를 누르면 첫번째 창에서 Cal이 입력값의 합으로 변경.



public class Y0128_1555 extends Frame{
	
	JLabel j2 =new JLabel("출력");
	
	Y0128_1555(){
		setTitle("frame");
		this.setLayout(new FlowLayout());
		JButton j = new JButton("Cal");

		this.add(j);
		this.add(j2);
		
		j.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Dia d = new Dia();
				d.setSize(200,200);
				d.setVisible(true);
				
			}
		});
		
		setSize(256,256);
		setVisible(true);
		
	}
	class Dia extends JDialog {
		
		Dia(){
			this.setLayout(new FlowLayout());
			JTextField num1 = new JTextField(10);
			JTextField num2 = new JTextField(10);
			JButton plus = new JButton("ADD");
			this.add(num1);
			this.add(num2);
			this.add(plus);
			
			// add 버튼을 누르면 num과 area 수 더 하기 
			plus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int i1 = Integer.parseInt(num1.getText());
					int i2 = Integer.parseInt(num2.getText());
					
					String str = Integer.toString(i1+i2);
					j2.setText(str);
					
				}
			});
			
		}
		
	}

	public static void main(String[] args) {
		new Y0128_1555();
	}
}
