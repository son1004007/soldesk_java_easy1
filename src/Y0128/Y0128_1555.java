package Y0128;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


//���� frame
//��ư Cal
//��ư���� ��� ���
//
//��ư ������ ��â ����
//Jdialog

//�� ���� ���մϴ�. (�Է� â)
//(���â) ADD ��ư
//��â���� ADD�� ������ ù��° â���� Cal�� �Է°��� ������ ����.



public class Y0128_1555 extends Frame{
	
	JLabel j2 =new JLabel("���");
	
	Y0128_1555(){
		setTitle("frame");
		this.setLayout(new FlowLayout());
		JButton j = new JButton("Cal");

		this.add(j);
		this.add(j2);
		
		j.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Dia d = new Dia();
				d.setSize(200,200);
				d.setVisible(true);
				
			}
		});
		
		setSize(256,256);
		setVisible(true);
		
	}
	class Dia extends JDialog {
		
		Dia(){
			this.setLayout(new FlowLayout());
			JTextField num1 = new JTextField(10);
			JTextField num2 = new JTextField(10);
			JButton plus = new JButton("ADD");
			this.add(num1);
			this.add(num2);
			this.add(plus);
			
			// add ��ư�� ������ num�� area �� �� �ϱ� 
			plus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int i1 = Integer.parseInt(num1.getText());
					int i2 = Integer.parseInt(num2.getText());
					
					String str = Integer.toString(i1+i2);
					j2.setText(str);
					
				}
			});
			
		}
		
	}

	public static void main(String[] args) {
		new Y0128_1555();
	}
}
