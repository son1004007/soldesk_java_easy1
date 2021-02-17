package Y0127;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Y0127_1230 extends JFrame{
	Y0127_1230() {
		
		Container c = getContentPane();//컨테이너 범위잡기
		
		c.setLayout(new FlowLayout());

		JCheckBox j1 = new JCheckBox("C++");
		JCheckBox j2 = new JCheckBox("C");
		JCheckBox j3 = new JCheckBox("Java");
		
		c.add(j1);
		c.add(j2);
		c.add(j3);
		//check box 이벤트 처리 : 
		//addItemListener - JCheckBox, JRadioButton
		//itmeStateChanged
		// public void itmeStateChanged()
		
		setVisible(true);
		setSize(256,256);
	}
	public static void main(String[] args) {
		new Y0127_1230();
	}
}