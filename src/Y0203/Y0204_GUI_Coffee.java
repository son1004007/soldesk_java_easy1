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
		
		// 메뉴 : 메뉴만 활성화되어 있고, 다른키는 비활성화 상태에서 메뉴를 누르면 +, -, 확인 키가 활성화 된다.
		JButton b1 = new JButton("아메리카노");
		JButton b2 = new JButton("카페라때");
		JButton b3 = new JButton("카푸치노");
		
		add(b1);
		add(b2);
		add(b3);
		
		b1.setBounds(30, 30, 100, 100); //  ( 가로위치, 세로위치, 가로크기, 세로크기)
		b2.setBounds(160, 30, 100, 100);
		b3.setBounds(290, 30, 100, 100);
		
		// 가격 : 표시만.
		int p1 = 5000, p2 = 5500, p3 =6000;
		Label l1 = new Label(p1+"원");
		Label l2 = new Label(p2+"원");
		Label l3 = new Label(p3+"원");
		
		l1.setBounds(60, 140, 80, 20); //  ( 가로위치, 세로위치, 가로크기, 세로크기)
		l2.setBounds(190, 140, 80, 20);
		l3.setBounds(320, 140, 80, 20);
		add(l1);
		add(l2);
		add(l3);
		
		
		// 수량 : 수량은 0을 기본값으로 +, - 키로 음수와 양수 모두 표현되며, 갯수에 따라 총 가격을 더하고 뺀다. 
		TextField su1 = new TextField("0");
		TextField su2 = new TextField("0");
		TextField su3 = new TextField("0");
		
		su1.setBounds(50, 170, 60, 20);
		su2.setBounds(180, 170, 60, 20);
		su3.setBounds(310, 170, 60, 20);
		
		add(su1);
		add(su2);
		add(su3);
		
		// + 버튼 : 갯수 증가
		JButton bp1 = new JButton("+");
		JButton bp2 = new JButton("+");
		JButton bp3 = new JButton("+");
		
		bp1.setBounds(30, 170, 20, 20); //  ( 가로위치, 세로위치, 가로크기, 세로크기)
		bp2.setBounds(160, 170, 20, 20);
		bp3.setBounds(290, 170, 20, 20);
		
		add(bp1);
		add(bp2);
		add(bp3);
		
		// - 버튼 : 갯수 감소
		JButton bm1 = new JButton("-");
		JButton bm2 = new JButton("-");
		JButton bm3 = new JButton("-");
		
		bm1.setBounds(80, 170, 20, 20);
		bm2.setBounds(340, 170, 20, 20);
		bm3.setBounds(600, 170, 20, 20);
		
		add(bm1);
		add(bm2);
		add(bm3);
		// 확인 버튼 : 모든 버튼 비활성화
		
		// 메뉴별 가격 : 메뉴별, 증감된 갯수 가격
		
	}

	public static void main(String[] args) {
		new Y0204_GUI_Coffee();
		// 아메리카노 
	}
}
