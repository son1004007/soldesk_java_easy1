package Y0127;
//2. 컨텐트팬의 배경색을 blue색으로 하고, Ok, Cancel, Get 버튼을 부착한 프로그램 작성해라.
//2.1 Ok 버튼을 누르면 컨텐트팬 색을 orange, 
//Cancel 버튼을 누르면 버튼을 비활성화시키고 Get 버튼을 누르면 버튼의 위치(x,y)값을 출력해라.

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Y0127_14502 extends JFrame {
	 Y0127_14502(){
		 
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.blue);
		
		JButton j1 = new JButton("ok");
		JButton j2 = new JButton("cancel");
		JButton j3 = new JButton("get");
		
//		j1.addMouseListener(m);
//		j2.addMouseListener(m2);
		j1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.setBackground(Color.orange);
			}
		});
		
		j2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				j2.setEnabled(false);
			}
		});
		
		j3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(j3.getX()+""+j3.getY());
			}
		});
		
		c.add(j1);
		c.add(j2);
		c.add(j3);
		
		setSize(256,256);
		setVisible(true);
		
	 }
	public static void main(String[] args) {
		new Y0127_14502();
	}

}
