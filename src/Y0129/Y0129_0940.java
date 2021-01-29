package Y0129;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Y0129_0940 extends JFrame {

	JLabel j = new JLabel("문자열");

	Y0129_0940() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(j);
		setSize(200,200);
		setVisible(true);
		c.addKeyListener(new Key());
		c.requestFocus(); // 컨텐트팬에 포커스 설정
		// 키 입력 가능하도록
	}

	class Key extends KeyAdapter {

		public void keyPressed(KeyEvent e) {

			int a = (int) (Math.random() * 256);
			int b = (int) (Math.random() * 256);
			int c = (int) (Math.random() * 256);
			// 0~255

			switch (e.getKeyChar()) {
			// 입력된 하나 문자 얻어내기

			case '\n':
				j.setText(a + " " + b + " " + c);
				getContentPane().setBackground(new Color(a, b, c));
				break;

			case 'p':
				System.exit(0); // 프로그램 종료
			}
		}
	}

	public static void main(String[] args) {
		new Y0129_0940();
	}
}