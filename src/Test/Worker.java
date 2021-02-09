package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Worker {
	private int sid;
	private String name;
	private String dep;
	private String address;
	private String birthday;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	public static void main(String[] args) {
		ArrayList<Worker> arr = new ArrayList<Worker>();
		
		int num=0;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("<사원 정보 관리 프로그램>");
			System.out.println("1. 사원정보 입력");
			System.out.println("2. 사원정보 개별 조회");
			System.out.println("3. 프로그램 종료");
//			System.out.println("4. 모든 사원 출력");
			System.out.print("번호 입력 : ");
			num = input.nextInt();
			
			Worker worker = new Worker();
			if(num == 1 ) {		//"1. 사원정보 입력")
				System.out.print("사번 : ");
				int sid = input.nextInt();
				worker.setSid(sid);
				
				System.out.print("이름 : ");
				String name = input.next();
				worker.setName(name);
				
				System.out.print("부서 : ");
				String dep = input.next();
				worker.setDep(dep);
				
				System.out.print("주소 : ");
				String address = input.next();
				worker.setAddress(address);
				
				System.out.print("생일 : ");
				String brithday = input.next();
				worker.setBirthday(brithday);
				
				arr.add(worker);
				System.out.println("사원정보가 입력되었다.");		
			}
			
			else if(num == 2) {	//"2. 사원정보 개별 조회"
				System.out.println("검색하고자 하는 사원의 사번은? ");
				int searchId = input.nextInt();
				
				for (int i =0; i < arr.size(); i++) {
					if(arr.get(i).getSid()==searchId) {
						System.out.println("사번 : "+arr.get(i).getSid());
						System.out.println("이름 : "+arr.get(i).getName());
						System.out.println("부서 : "+arr.get(i).getDep());
						System.out.println("주소 : "+arr.get(i).getAddress());
						System.out.println("생일 : "+arr.get(i).getBirthday());
						break;
					}
					else {
						System.out.println("해당 사원이 없습니다.");
					}
				}
			}
			
			else if(num == 3) {	//("3. 프로그램 종료");
				System.out.println("프로그램 종료");
				break;
			}
			
//			else if(num == 4) {	// 모든 사원 출력
//				for(int i=0; i< arr.size(); i++) {
//					System.out.println("사번 : "+arr.get(i).getSid());
//					System.out.println("이름 : "+arr.get(i).getName());
//					System.out.println("부서 : "+arr.get(i).getDep());
//					System.out.println("주소 : "+arr.get(i).getAddress());
//					System.out.println("생일 : "+arr.get(i).getBirthday());
//				}
//			}
			
			else {
				System.out.println("잘못된 입력");
			}
		}while(true);
		
		
	}



}
