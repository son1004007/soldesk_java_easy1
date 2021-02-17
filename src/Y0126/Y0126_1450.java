package Y0126;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Y0126_1450 {

	static class MyGUI extends JFrame{
		MyGUI(){

			
			super("Title");
			setVisible(true);
			setSize(256,256);
			
//			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//			setTitle("FlowLayout 연습");
//			this.setLayout(new FlowLayout());
			
			JButton btn1 = new JButton("버튼1");
			JButton btn2 = new JButton("버튼2");
			JButton btn3 = new JButton("버튼3");
			JButton btn4 = new JButton("버튼4");
			
			Container c = getContentPane();//컨텐트팬 알아낸다.
			c.add(btn1);
			c.add(btn2);
			c.add(btn3);
			c.add(btn4);
			c.setLayout(new FlowLayout());
			
			
			
			
		}
	}
	public static void main(String[] args) {
		new MyGUI();
	}
}
