package Y0127;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Y0127_Test1 extends JFrame {
JTextField j=new JTextField(20);
JTextArea j1=new JTextArea(10, 20);


Y0127_Test1(){
Container c=getContentPane();
c.setLayout(new FlowLayout());

JLabel jl=new JLabel("엔터기입력");
c.add(jl);
c.add(j);
c.add(new JScrollPane(j1));

j.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String s=j.getText();
		j1.append(s);
		j.setText("");
	}
});
setSize(512,512);
setVisible(true);
}


public static void main(String[] args) {
new Y0127_Test1();
}
}