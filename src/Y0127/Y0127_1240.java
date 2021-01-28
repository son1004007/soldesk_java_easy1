package Y0127;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Y0127_1240 extends JFrame{
	Y0127_1240() {
		
		JCheckBox j = new JCheckBox("자바"); // 프래임을 flow
		this.setLayout(new FlowLayout());
		j.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					System.out.println("자바 재밌다.");
				}
			}
		});
		
		this.add(j);
		setSize(256,256);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new Y0127_1240();
	}
}