package Y0126;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Y0126_1542 extends JFrame{
	Y0126_1542(){
		super("Color");
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.yellow);

		
		c.add(new Button("java"));
		c.add(new Button("db"));
		c.add(new Button("html"));
		
		setVisible(true);
		setSize(256,256);
	}
	
	public static void main(String[] args) {
		
		new Y0126_1542();
	}

}
