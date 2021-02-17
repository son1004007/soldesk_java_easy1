package Y0127;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class Mouse implements MouseListener{
	public void mouseClicked(MouseEvent e) {
		System.out.println("���콺 Ŭ��");
	}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
}
//MouseListner �������̽��� ������ �ʿ����� ���� �߻�޼ҵ� 5���� �� ����� �Ѵ�.
// �̷� �������� ����ϱ� ���� MouseAdapter�� Ȱ���� �� �ִ�.��

public class Y0127_1030 {

	public static void main(String[] args) {
		//��� �ȹް�, JFrame ��ü ����
		JFrame f = new JFrame();
		f.setLayout(new FlowLayout());
		
//		Mouse m = new Mouse(); // ���콺 ��ü
		MouseListener m = new Mouse(); // mouse ����� ���� upcasting
		
		JButton j1 = new JButton("one");
		JButton j2 = new JButton("two");
		
		j1.addMouseListener(m);
		j2.addMouseListener(m);
		
		f.add(j1);
		f.add(j2);
		f.setVisible(true);
		
	}
}
