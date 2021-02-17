package Y0128;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;


//5. 라디오버튼 이름을 “magenta”, ”red” 두개로 설정하고
// magenta를 누르면 버튼의 색을 magenta로, red를 누르면 red색으로 변경해라

public class Y0128_1230 extends JFrame {
	JRadioButton rdo1 = new JRadioButton("magenta");
	JRadioButton rdo2 = new JRadioButton("red");

	Y0128_1230(){
		Container c = getContentPane();
		c.add(rdo1);
		c.add(rdo2);
		c.setLayout(new FlowLayout());
		
		ButtonGroup b1 = new ButtonGroup();
		b1.add(rdo1);
		b1.add(rdo2);
		
		A a = new A();
		rdo1.addItemListener(a);
		rdo2.addItemListener(a);
		
		setSize(256,256);
		setVisible(true);
	 }

	class A implements ItemListener {

		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()!=ItemEvent.SELECTED) {
				return;
			}
			if(e.getItem()==rdo1) {
				getContentPane().setBackground(Color.magenta);
			}
			else if(e.getItem()==rdo2) {
				getContentPane().setBackground(Color.red);
			}
		}
	}
	public static void main(String[] args) {
		new Y0128_1230();
	}

}
