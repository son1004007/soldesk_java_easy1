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
		//이벤트가 어디서 일어났는지 알아낸다!!
		if(j.getText().equals("실행")) {
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
						
			JButton j=new JButton("실행");
		    j.addActionListener(new My4());
						
		c.add(j);
						
		setVisible(true);
	}

	public static void main(String[] args){
		new Y0127_1010();
	}
}
	