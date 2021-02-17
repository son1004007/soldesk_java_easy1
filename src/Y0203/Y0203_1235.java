package Y0203;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Y0203_1235 {
// Server side
	public static void main(String[] args) throws IOException {
		BufferedWriter out	= null;
		BufferedReader in 	= null;
		
		ServerSocket serso	= null;
		Socket clso			= null;
		
		Scanner sc = new Scanner(System.in);
		
		
		try {
			serso = new ServerSocket(9999); // listen port open
		}catch(Exception e) {}
		System.out.println("State : Listen");
		
		
		try {
			clso = serso.accept();
		}catch(Exception e) {}
		System.out.println("Server : Established");
		
		
		try {
			out = new BufferedWriter
					(new OutputStreamWriter
							(clso.getOutputStream()));
			
			in = new BufferedReader
					(new InputStreamReader
							(clso.getInputStream()));
		
		
		
		
			while(true) {
				String msg = in.readLine();	// ���� �޽����� msg�� ����
				if(msg.equals("stop")){		// ���� �޽���(msg)�� stop �̸� ����
						System.out.println("����");
						break;
				}
				System.out.println(msg);	// ���� �޽��� ���
				System.out.println("������");	
				String outmsg = sc.nextLine();	// �Է¹� ����
				
				out.write(outmsg+"\n");	//�޽��� ������ �ٹٲٱ�.
				out.flush(); 			// ���� ����
				
				// ���� ���ۿ� ����� ������
				// Ŭ���̾�Ʈ���� �����ϰ�
				// ���۸� ����.
			}
		}catch(Exception e) {}
		finally {
			try {
				sc.close();
				clso.close();
				serso.close();
			}catch(Exception e) {}
		}
	}
}
