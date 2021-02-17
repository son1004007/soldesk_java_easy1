package Y0127;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
// 2021-01-27 ����
// üũ�ڽ� üũ�ϸ�, ������ư Ȱ��ȭ
// ������ư �����ϸ�, ���� ���?
// 28�ϱ���.

//2. "���� ����"�̶�� üũ�ڽ� �ϳ�, "Java", "Python", "C#"�̶�� ���� ��ư ������ �����
//"���μ���"�� Ȱ��ȭ�ϰ� ���� ��ư ������ ��Ȱ��ȭ�� �ʱ�ȭ�Ѵ�.
//"���μ���"�� üũ�ϸ� ���� ��ư ������ Ȱ��ȭ �ȴ�.
//�� ���¿��� 
//"Java"�� ������ "�ڹ�!!" "Python"������ "���̽�!!", "C#"�� ������ "C#!!"�̶�� ����Ѵ�.

import javax.swing.JFrame;
import javax.swing.JRadioButton;


public class Y0127_1730{
	
	
	Y0127_1730(){
		JFrame f = new JFrame();
		
		f.setLayout(new FlowLayout());
		
		JCheckBox c0 = new JCheckBox("���� ����");
		f.add(c0);
		
		JRadioButton rdo1 = new JRadioButton("Java");
		JRadioButton rdo2 = new JRadioButton("Python");
		JRadioButton rdo3 = new JRadioButton("C#");
		
		
		f.add(rdo1);
		f.add(rdo2);
		f.add(rdo3);
		
		
		ButtonGroup b1 = new ButtonGroup();
		b1.add(rdo1);
		b1.add(rdo2);
		b1.add(rdo3);
		
		rdo1.setEnabled(false);
		rdo2.setEnabled(false);
		rdo3.setEnabled(false);
		
		c0.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					System.out.println("���� ����");
					rdo1.setEnabled(true);
					rdo2.setEnabled(true);
					rdo3.setEnabled(true);
				}
			}
		});
		
		rdo1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Java");
			}
		});
		
		rdo2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Python");
			}
		});
		rdo3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("C#");
			}
		});
		
		f.setVisible(true);
		f.setSize(512,256);
		
	}
	

	public static void main(String[] args) {
		new Y0127_1730();
	}
}

