package Y0120;
import java.io.Serializable;

//20210120 작성
public class Y0120_Stu implements Serializable {
// 직렬화 인터페이스
	
	private String name;
	private String id;
	private int age;
	
	//커서를 여기에 두고 source > generate getter and setter
	// 객체를 파일에 저장한다 (objectOutputStream) 직렬화 Serializable ?설명 뭐같음.
	// 저장된 객체를 읽는다. (ObjectIntputStream) 역직렬화
	public String getName() {
		return name;
	}
	public void setName(String name) { // 초기화
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) { // 초기화
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
