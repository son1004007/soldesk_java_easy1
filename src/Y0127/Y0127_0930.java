package Y0127;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
class My0 implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JButton j = (JButton) e.getSource();
	}

	
}
public class Y0127_0930 extends JFrame{
	Y0127_0930(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		//"����"��ư
		JButton j = new JButton("����");
		j.addActionListener(new My0());
		
		c.add(j);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Y0127_0930();
	}
}
