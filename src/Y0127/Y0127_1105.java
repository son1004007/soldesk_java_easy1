package Y0127;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
//�巡���Ҷ� �� �����ϴ� ���α׷�
//mouseDragged: ���콺 �巡���Ҷ�, mouseReleased: ���콺 ���� 

//class Mouse1105 implements MouseMotionListener, MouseAdapter { // �̷��� ������ �޼ҵ� 5�� ��������� ���� �Ʒ� ó�� ����.
class Mouse1105 extends MouseAdapter {//implements MouseMotionListener {
	public void mouseDragged(MouseEvent e) {
		Container c = (Container)e.getSource();
		c.setBackground(Color.yellow);
	}
	//public void mouseMoved(MouseEvent e) {}
	public void mouseReleaed(MouseEvent e) {
		Container c = (Container)e.getSource();
		c.setBackground(Color.pink);
	}
}

public class Y0127_1105 extends JFrame {
	Y0127_1105(){
		Container c = getContentPane();
		c.setBackground(Color.pink);
		
		c.addMouseMotionListener(new Mouse1105());
		c.addMouseListener(new Mouse1105());
		
		setVisible(true);
		setSize(256,256);
	}
	public static void main(String[] args) {
		
		new Y0127_1105();

	}

}
