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
			System.out.println("<��� ���� ���� ���α׷�>");
			System.out.println("1. ������� �Է�");
			System.out.println("2. ������� ���� ��ȸ");
			System.out.println("3. ���α׷� ����");
//			System.out.println("4. ��� ��� ���");
			System.out.print("��ȣ �Է� : ");
			num = input.nextInt();
			
			Worker worker = new Worker();
			if(num == 1 ) {		//"1. ������� �Է�")
				System.out.print("��� : ");
				int sid = input.nextInt();
				worker.setSid(sid);
				
				System.out.print("�̸� : ");
				String name = input.next();
				worker.setName(name);
				
				System.out.print("�μ� : ");
				String dep = input.next();
				worker.setDep(dep);
				
				System.out.print("�ּ� : ");
				String address = input.next();
				worker.setAddress(address);
				
				System.out.print("���� : ");
				String brithday = input.next();
				worker.setBirthday(brithday);
				
				arr.add(worker);
				System.out.println("��������� �ԷµǾ���.");		
			}
			
			else if(num == 2) {	//"2. ������� ���� ��ȸ"
				System.out.println("�˻��ϰ��� �ϴ� ����� �����? ");
				int searchId = input.nextInt();
				
				for (int i =0; i < arr.size(); i++) {
					if(arr.get(i).getSid()==searchId) {
						System.out.println("��� : "+arr.get(i).getSid());
						System.out.println("�̸� : "+arr.get(i).getName());
						System.out.println("�μ� : "+arr.get(i).getDep());
						System.out.println("�ּ� : "+arr.get(i).getAddress());
						System.out.println("���� : "+arr.get(i).getBirthday());
						break;
					}
					else {
						System.out.println("�ش� ����� �����ϴ�.");
					}
				}
			}
			
			else if(num == 3) {	//("3. ���α׷� ����");
				System.out.println("���α׷� ����");
				break;
			}
			
//			else if(num == 4) {	// ��� ��� ���
//				for(int i=0; i< arr.size(); i++) {
//					System.out.println("��� : "+arr.get(i).getSid());
//					System.out.println("�̸� : "+arr.get(i).getName());
//					System.out.println("�μ� : "+arr.get(i).getDep());
//					System.out.println("�ּ� : "+arr.get(i).getAddress());
//					System.out.println("���� : "+arr.get(i).getBirthday());
//				}
//			}
			
			else {
				System.out.println("�߸��� �Է�");
			}
		}while(true);
		
		
	}



}
