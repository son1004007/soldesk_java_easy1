package Y0129;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;


public class Y0129_hw2 extends Frame {

	
	Y0129_hw2(){
		int n = (int)(Math.random()*10)+1;
		JLabel j = new JLabel(""+n+"");
		setTitle("hw2");
		setLayout(new FlowLayout());
		
		JButton j1 = new JButton("+5");
		JButton j2 = new JButton("-5");
		JButton j3 = new JButton("/5");
			
		add(j);
		add(j1);
		add(j2);
		add(j3);
	
		setVisible(true);
		setSize(512,512);
	
		j1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = j.getText();
				int a = Integer.parseInt(str);
				Integer i1 = a+5;
				String str2 = i1.toString();
				j.setText(str2);
				j1.setEnabled(false);
			}
		});
		
		j2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = j.getText();
				int a = Integer.parseInt(str);
				Integer i1 = a-5;
				String str2 = i1.toString();
				j.setText(str2);
				j2.setEnabled(false);
			}
		});
		
		j3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = j.getText();
				int a = Integer.parseInt(str);
				Integer i1 = a/5;
				String str2 = i1.toString();
				j.setText(str2);
				j3.setEnabled(false);
			}
		});
		
	}
	public static void main(String[] args) {
		new Y0129_hw2();
	}
}
