package Y0127;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Y0127_1430 extends JFrame{

	Y0127_1430(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel j =new JLabel("안녕하세요");
		ImageIcon i = new ImageIcon("C:/Users/son10/Pictures/test1.jpg");
//		ImageIcon i2 = new ImageIcon(‪"‪C:/Users/jstco/Downloads/coding.jpg");
		JLabel j1 = new JLabel(i);
		JLabel j2 = new JLabel("수요일이네요", SwingConstants.CENTER);
		
		c.add(j);
		c.add(j1);
		c.add(j2);
		setSize(512,800);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Y0127_1430();
	}
}
