package Y0203;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Y0203_1300 {
//client side
	public static void main(String[] args) {
		BufferedWriter out	= null;
		BufferedReader in 	= null;
		
		Socket clso			= null;	
		
		Scanner sc = new Scanner(System.in);
		
		try {
//			clso = new Socket("8.8.8.8", 9999);	// google dns (server)destination IP, port
			clso = new Socket("localhost", 9999); // (server)destination IP, port
			System.out.println("Client : Established");
			
			in = new BufferedReader
					(new InputStreamReader
							(clso.getInputStream()));
			
			out = new BufferedWriter
					(new OutputStreamWriter
							(clso.getOutputStream()));
			
			
		
		
			while(true) {
				System.out.println("������");
				String outmsg = sc.nextLine();	// �Է� ���� ���ڿ� outmsg�� ����
				
				
				out.write(outmsg+"\n");	//outmsg�� out���� �޽��� ������ �ٹٲٱ�.
				out.flush(); 			// ���� ����
				String msg = in.readLine();	// ���� �޽��� msg�� ����
				System.out.println(msg);	// ���� �޽��� ���
				
				if(outmsg.equalsIgnoreCase("stop")) { 
					// equalsIgnoresCase�� equals�� ����������
					// ��ҹ��� �������� �ʴ´�.
					// stop �̶�� ������ �����Ѵ�.
					System.out.println("����");
					break;
				}
			}
			clso.close();
		}catch(Exception e) {}
		sc.close();
		
	}
	
}
