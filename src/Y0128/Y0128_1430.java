package Y0128;

// �˾� ���̾�α�
// 1) �Է� ���̾�α�
// JOptionPane.showInputDialog()
// "OK" ��ư�� ������ �Է��� �� ����
// "Cancel" ��ư�� ������ Null �� ����

// 2) Ȯ�� ���̾�α�
// JOptionPane.showConfirmDialog()

// 3) �޽��� ���̾�α�
// JOptionPane.show
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Y0128_1430 extends JFrame {
	Y0128_1430() {
		super("���̾�α�");
		Container c = getContentPane();
		c.add(new Dia(), BorderLayout.NORTH);
		setSize(512,512);
		setVisible(true);
	}
	class Dia extends Panel {
		JButton j = new JButton("�̸� �Է�");
		JTextField j1 = new JTextField(10);
		JButton j2 = new JButton("Ȯ��");
		JButton j3 = new JButton("�޽���");
		
		
		
		Dia() {
			setBackground(Color.pink);
			add(j);
			add(j1);
			add(j2);
			add(j3);
			
			
			j.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String name = JOptionPane.showInputDialog("�̸� �Է�");
					if (name != null) { // �̸��� �Է��ߴ�
						j1.setText(name);
					}
				}
			});
			j2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int r =
							JOptionPane.showConfirmDialog
							(null, "����Ұ̴ϱ�?", "Ȯ��",
									JOptionPane.YES_NO_OPTION);
					if (r == JOptionPane.CLOSED_OPTION) {
						j1.setText("���þ��ߴ�");
					}
					else if (r == JOptionPane.YES_OPTION) {
						j1.setText("��");
					}
					else
						j1.setText("�ƴϿ�");
				}
			});
			j3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog
					(null, "���", "�޽���",
							JOptionPane.WARNING_MESSAGE);
				}
			});
		}
	}
	public static void main(String[] args) {
		new Y0128_1430();
	}
}
