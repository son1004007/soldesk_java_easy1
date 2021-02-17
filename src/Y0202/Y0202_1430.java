package Y0202;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// HashSet�� Person ��ü�� �����Ѵ�.
// �й��� ������ ������ Person ��ü�� �Ǵ��ϰ�
// �ߺ� ������ ���� �ʵ��� �ڵ带 �ۼ��϶�.

class Person{
//	int age;
	String name;
	int num;
	
	Person(int num, String name){
		this.num =num;
		this.name = name;
	}
	public int hashCode() {
		return num%3;
	}
	
	public boolean equals(Object o) {
		Person p = (Person)o;
		if(p.num==num) {
			return true;
		} else {
			return false;
		}
	}
//	public String toString() {
//		if(p.num==num) {
//			return false
//		}
//		return num+" "+name;
//	}
}
public class Y0202_1430 {

	public static void main(String[] args) {
		Set<Person> s=new HashSet<Person>();
		s.add(new Person(12, "ȫ�浿"));
		s.add(new Person(23, "��浿"));
		s.add(new Person(12, "�̱浿"));
		
		Iterator<Person> it=s.iterator();
		while(it.hasNext()){
		 Person p=it.next();
		 System.out.println(p.num + " " + p.name);

		}
	}
}
