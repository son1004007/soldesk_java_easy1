package Y0127;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

class My4 implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JButton j=(JButton)e.getSource();
		//�̺�Ʈ�� ��� �Ͼ���� �˾Ƴ���!!
		if(j.getText().equals("����")) {
			j.setText("execute");
		}
		else
			j.setText("exe");
	}
}
public class Y0127_1010 extends JFrame{	
	Y0127_1010(){
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
						
			JButton j=new JButton("����");
		    j.addActionListener(new My4());
						
		c.add(j);
						
		setVisible(true);
	}

	public static void main(String[] args){
		new Y0127_1010();
	}
}
	