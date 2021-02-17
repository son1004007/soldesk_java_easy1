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
				String msg = in.readLine();	// 받은 메시지를 msg에 저장
				if(msg.equals("stop")){		// 받은 메시지(msg)가 stop 이면 종료
						System.out.println("종료");
						break;
				}
				System.out.println(msg);	// 받은 메시지 출력
				System.out.println("보내기");	
				String outmsg = sc.nextLine();	// 입력문 저장
				
				out.write(outmsg+"\n");	//메시지 보내고 줄바꾸기.
				out.flush(); 			// 버퍼 비우기
				
				// 현재 버퍼에 저장된 내용을
				// 클라이언트에게 전송하고
				// 버퍼를 비운다.
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
