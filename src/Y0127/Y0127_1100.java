package Y0127;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class Mouse1100 implements MouseMotionListener{
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getX()+" "+e.getY());
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getX()+" "+e.getY());
	}
}
public class Y0127_1100 {

	
	public static void main(String[] args) {
		//��� �ȹް�, JFrame ��ü ����
		JFrame f = new JFrame();
		f.setLayout(new FlowLayout());
		
//		Mouse m = new Mouse(); // ���콺 ��ü
//		MouseListener m = new Mouse1100(); // mouse ����� ���� upcasting
		
		JButton j1 = new JButton("one");
		JButton j2 = new JButton("two");
		
//		j1.addMouseListener(m);
//		j2.addMouseListener(m);
		
		j1.addMouseMotionListener(new Mouse1100());
		j2.addMouseMotionListener(new Mouse1100());
		
		
		f.add(j1);
		f.add(j2);
		f.setVisible(true);
		f.setSize(256,256);
	}
}
