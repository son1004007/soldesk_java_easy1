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
		//ok cancel 두개 버튼 만들고
		// 컨테이너 범위 잡는다.
		// 레이아웃은 flow로 주고
		//ok 버튼 누르면 ok 출력
		// cancel 버튼 누르면 버튼을 비활성화 시킨다.
		
		
		JFrame f = new JFrame();
		f.setLayout(new FlowLayout());
		
		Mouse1130 m = new Mouse1130(); // mouse 사용을 위한 upcasting
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
