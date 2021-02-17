package Y0204;

import java.awt.Button;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Y0204_hw extends JFrame{
	int count = 0;
	public Y0204_hw() {
		setLayout(null);
		setVisible(true);
		setBounds(0,0, 450, 450);
		
		String menu[] = {"아메리카노","카페라때","카푸치노"};
		int cost[] = {5000,5500,6000};
		JButton coffBt[] = new JButton[menu.length];
		TextField coffCnt[] = new TextField[menu.length];
		Button minusBt[] = new Button[menu.length];
		Button plusBt[] = new Button[menu.length];
		JButton okBt[] = new JButton[menu.length];
		Label shCost[] = new Label[menu.length];
		Label coffCost[] = new Label[menu.length];
//		Label totalCost = new Label();
		
		for (int i = 0; i < menu.length; i++) {
			
			coffBt[i] = new JButton(menu[i]);
			coffBt[i].setBounds(30+(i*130), 30, 100, 100);
			add(coffBt[i]);
			
			shCost[i] = new Label(cost[i]+"원"); 
			shCost[i].setBounds(60+(i*130), 140, 80, 20);
			add(shCost[i]);
			
			coffCnt[i] = new TextField("0");
			coffCnt[i].setBounds(50+(i*130), 170, 60, 20);
			add(coffCnt[i]);
			
			minusBt[i] = new Button("-");
			minusBt[i].setBounds(30+(i*130), 170,20,20);
			add(minusBt[i]);
			
			plusBt[i] = new Button("+");
			plusBt[i].setBounds(110+(i*130), 170, 20, 20);
			add(plusBt[i]);
			
			okBt[i] = new JButton("확인");
			okBt[i].setBounds(30+(i*130), 230, 100, 30);
			add(okBt[i]);
			
			coffCost[i] = new Label("원"); 
			coffCost[i].setBounds(60+(i*130), 300, 80, 20);
			add(coffCost[i]);
			
//			totalCost = new Label("총합 : ");
//			totalCost.setBounds(140, 350, 120, 20);
//			add(totalCost);
			
			coffBt[i].setEnabled(true);
			minusBt[i].setEnabled(false);
			plusBt[i].setEnabled(false);
			okBt[i].setEnabled(false);
			coffCnt[i].setEnabled(false);
			
			int j=i;
			// 커피 버튼 : 다른 버튼 비활성화를 활성화로 변경
			coffBt[i].addActionListener(new ActionListener() {
				
				 @Override
				 public void actionPerformed(ActionEvent e) {
					 for (int k = 0; k < menu.length;k++) {
						 minusBt[j].setEnabled(true);
						 plusBt[j].setEnabled(true);
						 okBt[j].setEnabled(true);
						 coffCnt[j].setEnabled(true);
						 count=0;
						 }
					 }
				 });
			
			// 빼기 : 
            minusBt[i].addActionListener(new ActionListener() {
            	
                @Override
                public void actionPerformed(ActionEvent e) {
//                    if (count > 0) {
                        count = count - 1;
                        coffCost[j].setText(count*cost[j]+"원");
                        coffCnt[j].setText(count + "");
                        okBt[j].setEnabled(true);
                        
//                    } else {
//                        minusBt[j].setEnabled(false);
//                    }
                }
            });
            
            // 더하기
            plusBt[i].addActionListener(new ActionListener() {
 
                @Override
                public void actionPerformed(ActionEvent e) {
                    count = count + 1;
                    coffCost[j].setText(count*cost[j]+"원");
                    coffCnt[j].setText(count + "");
                    okBt[j].setEnabled(true);
                    
//                    if (count > 0) {
//                        minusBt[j].setEnabled(true);
//                    }
                }
            });
            
            //확인 버튼 이벤트
            okBt[i].addActionListener(new ActionListener() {
 
                @Override
                public void actionPerformed(ActionEvent e) {
					minusBt[j].setEnabled(false);
					plusBt[j].setEnabled(false);
					okBt[j].setEnabled(false);
					coffCnt[j].enable(false);
                }
            });
            
          
		}
		
	}
	public static void main(String[] args) {
		new Y0204_hw();
	}
}
