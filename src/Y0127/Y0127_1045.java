package Y0127;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class Mouse1045 extends MouseAdapter{
	public void mouseClicked(MouseEvent e) {
		System.out.println("마우스 클릭");
	}
}


public class Y0127_1045 {

	public static void main(String[] args) {
		//상속 안받고, JFrame 객체 생성
		JFrame f = new JFrame();
		f.setLayout(new FlowLayout());
		
//		Mouse m = new Mouse(); // 마우스 객체
		MouseListener m = new Mouse1045(); // mouse 사용을 위한 upcasting
		
		JButton j1 = new JButton("one");
		JButton j2 = new JButton("two");
		
		j1.addMouseListener(m);
		j2.addMouseListener(m);
		
		f.add(j1);
		f.add(j2);
		f.setVisible(true);
		f.setSize(256,256);
		
	}
}
