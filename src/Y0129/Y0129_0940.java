package Y0129;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Y0129_0940 extends JFrame {

	JLabel j = new JLabel("���ڿ�");

	Y0129_0940() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(j);
		setSize(200,200);
		setVisible(true);
		c.addKeyListener(new Key());
		c.requestFocus(); // ����Ʈ�ҿ� ��Ŀ�� ����
		// Ű �Է� �����ϵ���
	}

	class Key extends KeyAdapter {

		public void keyPressed(KeyEvent e) {

			int a = (int) (Math.random() * 256);
			int b = (int) (Math.random() * 256);
			int c = (int) (Math.random() * 256);
			// 0~255

			switch (e.getKeyChar()) {
			// �Էµ� �ϳ� ���� ����

			case '\n':
				j.setText(a + " " + b + " " + c);
				getContentPane().setBackground(new Color(a, b, c));
				break;

			case 'p':
				System.exit(0); // ���α׷� ����
			}
		}
	}

	public static void main(String[] args) {
		new Y0129_0940();
	}
}