package Y0128;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

//6. JLabel j=new JLabel(��Hi); 
//���� j�� ���콺�� Ŭ���ϸ� ���ȳ硱�̶�� �ٲٴ� �ڵ带 �ۼ��ض�.

public class Y0128_1240 extends JFrame{
	Y0128_1240(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel j=new JLabel("Hi");
		c.add(j);
		
		j.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				j.setText("�ȳ�");
			}
		});
		
		setSize(256,256);
		setVisible(true);
		}

	
	
	public static void main(String[] args) {
		new Y0128_1240();
	}

}
