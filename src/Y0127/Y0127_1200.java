package Y0127;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Y0127_1200 extends JFrame{
	Y0127_1200() {
//		String s ="";
		JLabel j = new JLabel("�ڹٴ�"); 
		// ���콺�� �ڹٴ� �� �ø���, �ڹٴ� �̶�� ���ڿ��� ��վ��� ����
		
		
		Container c = getContentPane();//�����̳� �������
		
		c.setLayout(new FlowLayout());
		c.add(j);
		
		j.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent e) {
				j.setText("��վ�");
			}
			public void mouseExited(MouseEvent e) {
				j.setText("�ڹٴ�");
			}
		});
		
		
		setVisible(true);
		setSize(256,256);
	}
	public static void main(String[] args) {
		new Y0127_1200();
	}
}
