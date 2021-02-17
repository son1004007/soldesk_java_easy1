package Y0202;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// HashSet에 Person 객체를 저장한다.
// 학번이 같으면 동일한 Person 객체라 판단하고
// 중복 저장이 되지 않도록 코드를 작성하라.

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
		s.add(new Person(12, "홍길동"));
		s.add(new Person(23, "김길동"));
		s.add(new Person(12, "이길동"));
		
		Iterator<Person> it=s.iterator();
		while(it.hasNext()){
		 Person p=it.next();
		 System.out.println(p.num + " " + p.name);

		}
	}
}
