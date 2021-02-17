package Y0127;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class Mouse implements MouseListener{
	public void mouseClicked(MouseEvent e) {
		System.out.println("마우스 클릭");
	}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
}
//MouseListner 인터페이스는 구현에 필요하지 않은 추상메소드 5개를 다 적어야 한다.
// 이런 불편함을 대신하기 위해 MouseAdapter를 활용할 수 있다.ㅜ

public class Y0127_1030 {

	public static void main(String[] args) {
		//상속 안받고, JFrame 객체 생성
		JFrame f = new JFrame();
		f.setLayout(new FlowLayout());
		
//		Mouse m = new Mouse(); // 마우스 객체
		MouseListener m = new Mouse(); // mouse 사용을 위한 upcasting
		
		JButton j1 = new JButton("one");
		JButton j2 = new JButton("two");
		
		j1.addMouseListener(m);
		j2.addMouseListener(m);
		
		f.add(j1);
		f.add(j2);
		f.setVisible(true);
		
	}
}
