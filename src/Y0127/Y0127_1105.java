package Y0127;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
//드래그할때 색 변경하는 프로그램
//mouseDragged: 마우스 드래그할때, mouseReleased: 마우스 땔때 

//class Mouse1105 implements MouseMotionListener, MouseAdapter { // 이렇게 적으면 메소드 5개 다적어야함 따라서 아래 처럼 적음.
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
