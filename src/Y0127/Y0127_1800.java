package Y0127;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
//1. 아까 마지막에 작성한 JTextField에 적은 문자열을 JTextArea에 저장한다.
//(append(), getText(), setText() 사용)
public class Y0127_1800 extends JFrame{

	JTextField j = new JTextField(20);
	JTextArea j1 = new JTextArea(10,20);
	
	Y0127_1800(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel jl = new JLabel("enter 키 입력");
		c.add(jl);
		c.add(j);
		c.add(new JScrollPane(j1));
		
//		j.addKeyListener(new KeyAdapter() {
//			public void keyReleased(KeyEvent e) {
//			int key=e.getKeyCode();
//
//			if(key==KeyEvent.VK_ENTER) {
//			
//			String str=j.getText();
//			j1.setText(str);
//			
////			StringBuilder str1 = new StringBuilder(j.getText());
////			str1.append(j1.getText());
////			j1.setText(str1);
////			append는 StringBuilder를 사용해야만하고,
////			setText(문자열)만 받기때문에 동시에 사용할 수 있는 방법이 없는 것으로 보임.
////			다른 사람 코딩이나 내일 아침 강의때 문의.
//			
//			j.setText("");
//			}
//			}
//		});
		j.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				j1.append(j.getText());
				j.setText("");
				}
		});

		setVisible(true);
		setSize(512,512);
	}
	public static void main(String[] args) {
		new Y0127_1800();
	}
}
