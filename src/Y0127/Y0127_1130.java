package Y0127;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class Mouse1130 extends MouseAdapter {//implements MouseMotionListener {

	
	public void mouseClicked(MouseEvent e) {
		System.out.println("OK");
	}
}

class Mouse11301 extends MouseAdapter {

	public void mouseClicked(MouseEvent c) {
		System.out.println("Cancel");
//		setEnabled(false);
	}
}
public class Y0127_1130 {

	public static void main(String[] args) {
		//ok cancel �ΰ� ��ư �����
		// �����̳� ���� ��´�.
		// ���̾ƿ��� flow�� �ְ�
		//ok ��ư ������ ok ���
		// cancel ��ư ������ ��ư�� ��Ȱ��ȭ ��Ų��.
		
		
		JFrame f = new JFrame();
		f.setLayout(new FlowLayout());
		
		Mouse1130 m = new Mouse1130(); // mouse ����� ���� upcasting
		Mouse11301 m2 = new Mouse11301();
		
		
		JButton j1 = new JButton("ok");
		JButton j2 = new JButton("cancel");
		
		j1.addMouseListener(m);
		j2.addMouseListener(m2);
		
		
		f.add(j1);
		f.add(j2);
		f.setVisible(true);
		f.setSize(256,256);
	}
	
}
