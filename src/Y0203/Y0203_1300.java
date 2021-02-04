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
				System.out.println("보내기");
				String outmsg = sc.nextLine();	// 입력 받은 문자열 outmsg에 저장
				
				
				out.write(outmsg+"\n");	//outmsg를 out으로 메시지 보내고 줄바꾸기.
				out.flush(); 			// 버퍼 비우기
				String msg = in.readLine();	// 받은 메시지 msg에 저장
				System.out.println(msg);	// 받은 메시지 출력
				
				if(outmsg.equalsIgnoreCase("stop")) { 
					// equalsIgnoresCase는 equals와 동일하지만
					// 대소문자 구분하지 않는다.
					// stop 이라고 보내고 종료한다.
					System.out.println("종료");
					break;
				}
			}
			clso.close();
		}catch(Exception e) {}
		sc.close();
		
	}
	
}
