package Y0127;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Y0127_1650 extends JFrame{

	JRadioButton rdo1 = new JRadioButton("����");
	JRadioButton rdo2 = new JRadioButton("�ٴҶ�");
	JRadioButton rdo3 = new JRadioButton("ü��");
	
	Y0127_1650(){
		
		Container c = getContentPane();
		c.add(rdo1);
		c.add(rdo2);
		c.add(rdo3);
		c.setLayout(new FlowLayout());
		
		ButtonGroup b1 = new ButtonGroup();
		b1.add(rdo1);
		b1.add(rdo2);
		b1.add(rdo3);
		
		A a = new A();
		rdo1.addItemListener(a);
		rdo2.addItemListener(a);
		rdo3.addItemListener(a);
		
		setSize(256,256);
		setVisible(true);
	}
	class A implements ItemListener {

		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()!=ItemEvent.SELECTED) {
				return;
			}
			if(e.getItem()==rdo1) {
				System.out.println("����");
				getContentPane().setBackground(Color.CYAN);
			}
			else if(e.getItem()==rdo2) {
				System.out.println("�ٴҶ�");
				getContentPane().setBackground(Color.pink);
			}
			else if(e.getItem()==rdo3) {
				System.out.println("ü��");
				getContentPane().setBackground(Color.red);
			}
			
		}

	}
	public static void main(String[] args) {
		new Y0127_1650();
	}
}
