package Y0203;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Y0204_GUI_Coffee extends JFrame {

	Y0204_GUI_Coffee(){
		setLayout(null);
		setVisible(true);
		setSize(450,450);
		
		// �޴� : �޴��� Ȱ��ȭ�Ǿ� �ְ�, �ٸ�Ű�� ��Ȱ��ȭ ���¿��� �޴��� ������ +, -, Ȯ�� Ű�� Ȱ��ȭ �ȴ�.
		JButton b1 = new JButton("�Ƹ޸�ī��");
		JButton b2 = new JButton("ī���");
		JButton b3 = new JButton("īǪġ��");
		
		add(b1);
		add(b2);
		add(b3);
		
		b1.setBounds(30, 30, 100, 100); //  ( ������ġ, ������ġ, ����ũ��, ����ũ��)
		b2.setBounds(160, 30, 100, 100);
		b3.setBounds(290, 30, 100, 100);
		
		// ���� : ǥ�ø�.
		int p1 = 5000, p2 = 5500, p3 =6000;
		Label l1 = new Label(p1+"��");
		Label l2 = new Label(p2+"��");
		Label l3 = new Label(p3+"��");
		
		l1.setBounds(60, 140, 80, 20); //  ( ������ġ, ������ġ, ����ũ��, ����ũ��)
		l2.setBounds(190, 140, 80, 20);
		l3.setBounds(320, 140, 80, 20);
		add(l1);
		add(l2);
		add(l3);
		
		
		// ���� : ������ 0�� �⺻������ +, - Ű�� ������ ��� ��� ǥ���Ǹ�, ������ ���� �� ������ ���ϰ� ����. 
		TextField su1 = new TextField("0");
		TextField su2 = new TextField("0");
		TextField su3 = new TextField("0");
		
		su1.setBounds(50, 170, 60, 20);
		su2.setBounds(180, 170, 60, 20);
		su3.setBounds(310, 170, 60, 20);
		
		add(su1);
		add(su2);
		add(su3);
		
		// + ��ư : ���� ����
		JButton bp1 = new JButton("+");
		JButton bp2 = new JButton("+");
		JButton bp3 = new JButton("+");
		
		bp1.setBounds(30, 170, 20, 20); //  ( ������ġ, ������ġ, ����ũ��, ����ũ��)
		bp2.setBounds(160, 170, 20, 20);
		bp3.setBounds(290, 170, 20, 20);
		
		add(bp1);
		add(bp2);
		add(bp3);
		
		// - ��ư : ���� ����
		JButton bm1 = new JButton("-");
		JButton bm2 = new JButton("-");
		JButton bm3 = new JButton("-");
		
		bm1.setBounds(80, 170, 20, 20);
		bm2.setBounds(340, 170, 20, 20);
		bm3.setBounds(600, 170, 20, 20);
		
		add(bm1);
		add(bm2);
		add(bm3);
		// Ȯ�� ��ư : ��� ��ư ��Ȱ��ȭ
		
		// �޴��� ���� : �޴���, ������ ���� ����
		
	}

	public static void main(String[] args) {
		new Y0204_GUI_Coffee();
		// �Ƹ޸�ī�� 
	}
}
