package Y0127;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Y0127_1250 extends JFrame{
	Y0127_1250() {
		
		JMenuBar j = new JMenuBar();
		
		JMenu j1 = new JMenu("File");
		JMenu j2 = new JMenu("Edit");
		JMenu j3 = new JMenu("Source");
		
		JMenuItem j4 = new JMenuItem("New");
		JMenuItem j5 = new JMenuItem("Undo Typing");
		
		setJMenuBar(j);//메뉴바 호출
		
		j.add(j1);
		j.add(j2);
		j.add(j3);

		j1.add(j4);
		j2.add(j5);
		
		j4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("new");
				
			}
		});
		
		setSize(256,256);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new Y0127_1250();
	}
}