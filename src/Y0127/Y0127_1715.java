package Y0127;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Y0127_1715 extends JFrame {

	Y0127_1715(){
		Container c = getContentPane();
		JCheckBox j[] =  new JCheckBox[15];
		
		
		c.setLayout(new GridLayout(3,5));
		
		
		for(int i =0; i<j.length; i++) {
			  j[i] = new JCheckBox("체크박스" + (i+1));
		         c.add(j[i]);
		}
		
		
		
		setVisible(true);
		setSize(1024,256);
	}
	public static void main(String[] args) {
		new Y0127_1715();
	}
}
