package Y0121;

import java.util.Scanner;
public class Y0121_1240 {
	static int get(int grade[][]) {
		int high=0;
		for(int i=0;i<grade.length; i++) {
			for(int j=0;j<grade[i].length ; j++) {
				if(grade[i][j] > high) {
					high = grade[i][j];
				}
			}
		}
		return high;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade[][]= {{55,60,65},{85,90,95}};
		int high=0;
		high = get(grade);

		System.out.println("���� ���� ������ "+high+"�� �Դϴ�.");
		
//		7. �� �� �迭���� ����ܾ �Է¹޾� �ѱ��� ����ϴ� ���α׷�
//		String eng[]={��student��,��book��,��future��,��note��};
//		String kor[]={���л���,��å��,���̷���,����Ʈ��};
//		    ��stop"�� �Է��ϸ� ���α׷��� ������Ѷ�. (while(true), equals() ���)
//		������) ���� �ܾ� �Է�: book
//		å
//		     ���� �ܾ� �Է�: stop
		//eng �迭�� ���� �Է°��� ������, eng �迭�� ��ġ�� ���� kor �迭�� ���� ���.
		String eng[]={"student","book","future","note"};
		String kor[]={"�л�","å","�̷�","��Ʈ"};
		Scanner tmp = new Scanner(System.in);
		while(true) {
			System.out.println("���� �ܾ� �Է�");
			String str = tmp.next();
			for (int i=0; i<eng.length ; i++) {
				if(eng[i].equals(str)) {
//				if(eng[i]==str) { �迭�� ���� ���ڿ��� ���� ���ٰ� �ν����� ���Ѵ�. str�� ���� ���� �̱� ������ ����.
					System.out.println(kor[i]);
				}
			}
			if(str.equals("stop"))
				break;
			
		}
		tmp.close();

	}

}
