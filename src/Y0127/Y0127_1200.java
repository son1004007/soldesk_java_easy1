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
		JLabel j = new JLabel("자바는"); 
		// 마우스를 자바는 에 올리면, 자바는 이라는 문자열을 재밌어라고 변경
		
		
		Container c = getContentPane();//컨테이너 범위잡기
		
		c.setLayout(new FlowLayout());
		c.add(j);
		
		j.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent e) {
				j.setText("재밌어");
			}
			public void mouseExited(MouseEvent e) {
				j.setText("자바는");
			}
		});
		
		
		setVisible(true);
		setSize(256,256);
	}
	public static void main(String[] args) {
		new Y0127_1200();
	}
}
