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
//			setTitle("FlowLayout ����");
//			this.setLayout(new FlowLayout());
			
			JButton btn1 = new JButton("��ư1");
			JButton btn2 = new JButton("��ư2");
			JButton btn3 = new JButton("��ư3");
			JButton btn4 = new JButton("��ư4");
			
			Container c = getContentPane();//����Ʈ�� �˾Ƴ���.
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
