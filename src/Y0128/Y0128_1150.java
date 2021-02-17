package Y0128;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

//4.  컨텐트팬의 배경색을 빨간색으로 하고, Ok, Cancel 버튼을부착한 frame하나 만들어라
// Ok버튼을 누르면 “확인”, Cancel을 누르면 버튼을 비활성화 시켜라. 
//(MouseAdapter로 접근)

public class Y0128_1150 extends JFrame {
	Y0128_1150(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.red);
		
		JButton j1 = new JButton("ok");
		JButton j2 = new JButton("cancel");
		
		  j1.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent e) {
			    System.out.println("ok");
			   }
			 });
		  
		  j2.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent e) {
			    j2.setEnabled(false);
			   }
			 });
		  
		c.add(j1);
		c.add(j2);
		
		setSize(256,256);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Y0128_1150();
	}

}
