package Y0128;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Y0128_1540 extends JFrame{

	//GUI ¹öÆ° 5°³
	Y0128_1540(){
		Container c = getContentPane();
		c.setLayout(new GridLayout(1,5));
		
		
		for(int i =0;i <5; i++) {
			JButton j = new JButton(Integer.toString(i));
			c.add(j);
			
		}
		
		setVisible(true);
		setSize(512,512);
	}
	public static void main(String[] args) {
		new Y0128_1540();
	}
}
