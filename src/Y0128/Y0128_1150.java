package Y0128;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

//4.  ����Ʈ���� ������ ���������� �ϰ�, Ok, Cancel ��ư�������� frame�ϳ� ������
// Ok��ư�� ������ ��Ȯ�Ρ�, Cancel�� ������ ��ư�� ��Ȱ��ȭ ���Ѷ�. 
//(MouseAdapter�� ����)

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
