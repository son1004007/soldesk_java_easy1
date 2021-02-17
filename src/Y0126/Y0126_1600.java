package Y0126;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Y0126_1600 extends JFrame{
	Y0126_1600(){
		super("Image");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
//		JLabel j = new JLabel(" ¾È³ç");
		
		ImageIcon img = new ImageIcon("C:/Users/son10/Pictures/test1.jpg");
		JLabel i = new JLabel(img);
		
//		c.add(j);
		c.add(i);
		
		setVisible(true);
		setSize(256,256);
	}



	public static void main(String[] args) {
		new Y0126_1600();
	}
}
