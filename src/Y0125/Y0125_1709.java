package Y0125;

public class Y0125_1709 {
	public static void main(String[] args) {
		//StringBuffer
		//������ ������ ���� ������ ũ�⸦ �ڵ����� ������ �� �ִ�.
		//���ڿ��� ��ų� ���ڿ� �۾��� ���� ���
		
		StringBuffer sb = new StringBuffer("Java");
		sb.append(" is very good");
		// �ǳ��� �߰��Ѵ�.
		sb.insert(0, "A ");
		sb.replace(2, 6, "Html");
		System.out.println(sb);
	}
}
