package Y0120;
import java.io.Serializable;

//20210120 �ۼ�
public class Y0120_Stu implements Serializable {
// ����ȭ �������̽�
	
	private String name;
	private String id;
	private int age;
	
	//Ŀ���� ���⿡ �ΰ� source > generate getter and setter
	// ��ü�� ���Ͽ� �����Ѵ� (objectOutputStream) ����ȭ Serializable ?���� ������.
	// ����� ��ü�� �д´�. (ObjectIntputStream) ������ȭ
	public String getName() {
		return name;
	}
	public void setName(String name) { // �ʱ�ȭ
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) { // �ʱ�ȭ
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
