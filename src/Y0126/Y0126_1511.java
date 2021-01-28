package Y0126;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Y0126_1511 {

	public static void main(String[] args) {
		JFrame j = new JFrame();
		
		j.setTitle("BorderLayout");
		j.setSize(256,256);
		j.setLayout(new BorderLayout());
		
		//JButton j1 = new JButton();
		
		j.add(new JButton("동"), BorderLayout.EAST);
		//BorderLayout 은 위치 지정이 필요하다.
		
		j.add(new JButton("서"), BorderLayout.WEST);
		j.add(new JButton("남"), BorderLayout.SOUTH);
		j.add(new JButton("북"), BorderLayout.NORTH);
		j.add(new JButton("중앙"), BorderLayout.CENTER);
		
		j.setVisible(true);
		
	}
}
