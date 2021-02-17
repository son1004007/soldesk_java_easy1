package Y0128;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

class Text28 implements ActionListener{
	JTextField jid;
	JPasswordField jpw;
	
	public Text28(JTextField jid, JPasswordField jpw){
		this.jid=jid;
		this.jpw=jpw;
	}
	public void actionPerformed(ActionEvent e) {
		//오버라이딩 재정의
		System.out.println(jid.getText());
		System.out.println(jpw.getText());
	}
}
public class Y0128_1000 {
	public static void main(String[] args) {
	
		JFrame f = new JFrame();
		f.setBounds(120, 120, 150, 150);
		f.setLayout(new GridLayout(2,2));
		
		JLabel id = new JLabel("ID", SwingConstants.LEFT);
		JTextField jid = new JTextField(20);
		JLabel pw = new JLabel("PW", SwingConstants.LEFT);
		JPasswordField jpw = new JPasswordField(20);
		
		jpw.setEchoChar('*');
		
		jpw.addActionListener(new Text28(jid,jpw));
		f.add(id);
		f.add(jid);
		f.add(pw);
		f.add(jpw);
		
		f.setSize(512,512);
		f.setVisible(true);
		
	}
}
