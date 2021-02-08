package Test;

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
		Worker wk = new Worker();
		System.out.println("<사원 정보 관리 프로그램>");
		System.out.println("1. 사원정보 입력");
		System.out.println("2. 사원정보 개별 조회");
		System.out.println("3. 프로그램 종료");
		Scanner sc = new Scanner(System.in);
		int num=0;
		System.out.print("번호 입력 : ");
		num = sc.nextInt();
		
		do {
			if(num == 1 ) {		//"1. 사원정보 입력")
				System.out.print("사번 : ");
				int sid = sc.nextInt();
				wk.setSid(sid);
				System.out.print("이름 : ");
				String name = sc.next();
				wk.setName(name);
				System.out.print("부서 : ");
				String dep = sc.next();
				wk.setName(dep);
				System.out.print("주소 : ");
				String address = sc.next();
				wk.setName(address);
				System.out.print("생일 : ");
				String brithday = sc.next();
				wk.setName(brithday);
			}
			else if(num == 2) {	//"2. 사원정보 개별 조회"
				System.out.println("검색하고자 하는 사원의 사번 : ");
				System.out.println(wk.getSid());
				System.out.println(wk.getName());
				System.out.println(wk.getDep());
				System.out.println(wk.getAddress());
				System.out.println(wk.getBirthday());
				
			}
			else if(num == 3) {	//("3. 프로그램 종료");
				System.out.println("프로그램 종료");
				break;
			}
		}while(true);
		
		
	}



}
