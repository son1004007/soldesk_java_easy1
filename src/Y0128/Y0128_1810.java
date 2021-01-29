package Y0128;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Y0128_1810 extends JFrame {

	JLabel j1 = new JLabel("계산 출력");

	Y0128_1810() {
		Container c = getContentPane();
		setTitle("test123");
		c.setLayout(new FlowLayout());

		JButton b1 = new JButton("Cal");
		c.add(b1);
		c.add(j1);

		setSize(300, 300);
		setVisible(true);

		b1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Dia2 d = new Dia2();
				d.setVisible(true);

			}
		});

	}

	class Dia2 extends JDialog {

		Dia2() {
			Container c = getContentPane();
			JLabel j2 = new JLabel("두수를 더합니다");
			JTextField t1 = new JTextField(10);
			JTextField t2 = new JTextField(10);
			JButton b2 = new JButton("ADD");
			c.setLayout(new FlowLayout());
			setSize(300, 200);

			c.add(j2);
			c.add(t1);
			c.add(t2);
			c.add(b2);

			b2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String str = t1.getText();
					int a = Integer.parseInt(str);

					String str2 = t2.getText();
					int a2 = Integer.parseInt(str2);
					Integer n = a + a2;

					String dap = n.toString();
					System.out.println(dap);
					j1.setText(dap);

				}
			});

		}

	}
	public static void main(String[] args) {
		new Y0128_1810();
	}
}
