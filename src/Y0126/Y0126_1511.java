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
		
		j.add(new JButton("��"), BorderLayout.EAST);
		//BorderLayout �� ��ġ ������ �ʿ��ϴ�.
		
		j.add(new JButton("��"), BorderLayout.WEST);
		j.add(new JButton("��"), BorderLayout.SOUTH);
		j.add(new JButton("��"), BorderLayout.NORTH);
		j.add(new JButton("�߾�"), BorderLayout.CENTER);
		
		j.setVisible(true);
		
	}
}
