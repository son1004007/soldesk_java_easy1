package Y0129;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Y0129_1005 extends JFrame{
	JSlider j = new JSlider(100,200,150);
	JLabel j1 = new JLabel(" ");
	
	Y0129_1005(){
		setTitle("Y0129_1005 : �巡��");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(j); 
		c.add(j1);
		
		j.setMajorTickSpacing(20); // ū ���� ����
		j.setPaintLabels(true);
		j.setPaintTicks(true);
		
		j1.setHorizontalAlignment(JLabel.CENTER);
//		j1.setOpaque(true); // ���� ����. Magenta ������ �԰� �ϰڴ�.
		j1.setBackground(Color.MAGENTA);
		j1.setText(Integer.toString(j.getValue()));
		//���� �������� ���ڿ��� �����ؼ� �����ӿ� ����.
		
		j.addChangeListener(new ChangeListener() { // ���� �ű�� �� ǥ��

			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				j1.setText(Integer.toString(j.getValue()));
			}
		});
		
		setSize(200,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Y0129_1005();
	}
}
