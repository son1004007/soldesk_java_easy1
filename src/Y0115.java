import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileWriter;

public class Y0115 {

   static Scanner tmp = new Scanner(System.in);

   //�Լ� ����1
//   static double average (int a1, int a2) {
//	   double avg1= (a1+a2)/2.0;
//	   return avg1;
//   }
   //�Լ� ����2
//   static double average2() {
//
//     System.out.println("1�� ���� �Է��ϼ���");
//     int a1 = tmp.nextInt();
//     System.out.println("2�� ���� �Է��ϼ���");
//     int a2 = tmp.nextInt();
//     System.out.println("������ ��� ���");
//     return (a1+a2)/2.0;
//     
//   }
   //�Լ� ����3
//   static void average3() {
//
//	     System.out.println("1�� ���� �Է��ϼ���");
//	     int a1 = tmp.nextInt();
//	     System.out.println("2�� ���� �Է��ϼ���");
//	     int a2 = tmp.nextInt();
//	     System.out.println("������ ��� ���");
//	     System.out.println((a1+a2)/2.0);
//	     
//	   }
   //�迭+�Լ� ����1
//   static int total(int a3[]) {
//	   int sum=0;
//	   for (int i=0; i<a3.length ; i++) {
//		   sum += a3[i];
//	   }
//	   return sum;
//   }
   
//   //�迭+�Լ� ����2
//   static int total(int a4[][]) {
//	   int sum=0;
//	   for (int i=0; i<a4.length ; i++) {
//		   for(int j=0 ; j<a4[i].length ; j++)
//		   {
//			   sum += a4[i][j];
//		   }
//	   }
//	   return sum;
//   }
//   
//   //�迭 + ���� + ���� ������ ����
//   static void big(int a, int b) {
//	   
//	   if (a > b) {
//		   System.out.println(a + "�� ũ��");
//	   }
//	   else {
//		   System.out.println(b + "�� ũ��");
//	   }
//	   
//	   int n=(a>b)?a:b;
//	   System.out.println(n + "�� ũ��");
//   }
   
   public static void main(String[] args) throws IOException {
      
//	   //�Լ� ���� 1
//      System.out.println("1�� ���� �Է��ϼ���");
//      int a1 = tmp.nextInt();
//      System.out.println("2�� ���� �Է��ϼ���");
//      int a2 = tmp.nextInt();
//      System.out.println("������ ��� ���");
//      double avg1 = average(a1,a2);
//      System.out.println(avg1);
	   
	   //�Լ� ����2
//	   double avg2=average2();
//	   System.out.println(avg2);

	   //�Լ� ����3
//	   average3();
	   
	   //�迭+�Լ� ����1
//	   int a3[]=new int[] {1,2,3,4,5};
//	   System.out.println(total(a3));

	   //�迭+�Լ� ����2
//	   int a4[][]={{1,2,3},{4,5,6}};
//	   System.out.println(total(a4));
//	   
//	   //
//	   System.out.println("���� 2���� �Է��ϼ���");
//	   big(tmp.nextInt(), tmp.nextInt()); // �Լ� ȣ��
	   
	   
	   
	   //page 346 ���� 6. �������� a =100; �������� a =200
	   // �������� �켱������ ����. �� 200
	   
	   //���ڿ� ����1
//		length ���̺�
//		replace ���ڿ� ��ü
//		substring ���ڿ� ����
//		sprilt ���ڿ� �и�
//		trim �յ� ���� ����
//		compareTo ���ڿ� ��
//		contains ���ڿ� ���� Ȯ��
//		concat �� ���ڿ��� ���ڿ� ����
	   
	   //���� ����
	   //1. 1~10������ �Ѱ��� ����ض�.(while)
	   
//	   int mul1=1, i1=1;
//	   while(i1<=10) {
//		   //mul1=mul1*i1;
//		   mul1*=i1;
//		   i1++;
//	   }
//	   System.out.println(mul1);
//	   
//	   
//	   //2. �������� ¦���ܸ� ����ϸ鼭 �ش�Ǵ� ���� ��������
//	   //(2���� 2*2, 4���� 4*4, 6���� 6*6, 8���� 8*8)����ض�.(break)
//	   
//	   for (int i = 2 ; i<=9 ; i++) {
//		   for (int j = 2; j<=9 ; j++) {
//			   System.out.println(i*j + " ");
//			   
//			   if (i==j) {
//				   break;
//			   }
//		   }
//	   }
	   
	   
	   // page 352 �ǽ� 10-1 ����ó���� �⺻��
//	   int a[]=new int[3];
//	   try {
//
//		   a[3]=100;
//	   }
//
//	   catch (ArrayIndexOutOfBoundsException e) {
//		   System.out.println("�迭 ÷�ڰ� �迭 ũ�⺸�� ŭ");
//	   }
		
	   
	   // page 353 �ǽ� 10-2 ���� ó���� ��ü ��
	   
//	   int a353[] =new int[3];
//	   try {
//		   a353[2] = 100/0;
//		   a353[3] = 100;
//	   }
//	   catch(ArrayIndexOutOfBoundsException e){ // �ι�° ���� �޽��� �����ȵ�
//		   System.out.println(" �迭 ÷�ڰ� �迭 ũ�⺸�� Ŀ��");
//	   }
//	   catch(ArithmeticException e) { // ù��° ���� �޽��� �߻��ϸ� break ��
//		   System.out.println("0 ���� ������");
//	   }
//	   catch(Exception e) { // ���� Ŭ������ ���� Ŭ���� ���� ���� �������� �ȴ�. 
	   // ���� Ŭ������ ���� Ŭ�������� �켱�õȴ�.
//		   System.out.println("������ �ִ�.�ֻ��� Ŭ����");
//	   }
//	   finally {
//		   System.out.println("������ ����");
//	   }
//	   
	   
	   // page 379 ���� 26
//	   try {
//	   System.out.println("���� �Է��ϼ���");
//	   double i26 = tmp.nextDouble();
//	   
//	   
//	   System.out.println("���� �Է��ϼ���");
//	   double j26 = tmp.nextDouble();
//	   
//	   System.out.println("�����ڸ� �Է��ϼ���");
//	   char a26=tmp.next().charAt(0);
//	   
//	   switch (a26) {
//	   case '+' : {
//		   System.out.println(i26+ "+" +j26+ "=" +(i26+j26));
//	   }
//	   case '*' : {
//		   if (i26==0 || j26==0) {
//			   throw new Exception("�� �� 0�̸� �ȵ�");
//		   }
//		   System.out.println(i26*j26);
//		   break;
//	   }
//	   case '/' : {
//		   if (j26==0) {
//			   throw new Exception("�� �� 0�̸� �ȵ�");
//		   } 
//		   System.out.println(i26/j26);
//		   break;
//	   }
//	   
//	   }
//	   
//	   
//	   
//	   }catch(Exception i) {
//		   System.out.println(i.getMessage());
//	   }
	   
	   
	   //page 355 ����Ǯ��� 10-1
	   // �ǽ� 10-4�� �����Ͽ� a�� 0�� �ƴ� ��쿡�� 0�� ������ 0�Դϴ�. ������ �߰��� �߻��ϵ��� �غ���
	   
	   
	   
//	   String str1, str2;
//	   System.out.println(str1 = tmp.next());
//	   System.out.println(str2 = tmp.nextLine()); 
	   // nextLine�� ��������String�� ����(����, �ٹٲٱ�, �鿩����)���� �����Ͽ� �Է� �޴´�.
	   // 
	   // API document Ȯ��
	   // String :	nextLine() : Advances this scanner past the current line and returns the input that was skipped.

	   
	   // page 387 7��
	   
//	   String input = "";
//	   int key;
//	   
//	   System.out.println("���� �Ǵ� ���� �Է� ");
//	   while ((key = System.in.read()) != 13) { //���� : ���� ġ�� ��
//		   if((int)key < 49 ) { //�𸣰ڳ�..
//			   input += Character.toString((char)key); // key�� ���ڿ��� �����ؼ� input�� ����
//			   System.out.println("�Է��� ������ ���� : " + input);
//		   }
//		   
//	   }
	   
	  
	   
	   
	   
	   
	  
	   
	   /*
	   
	   // ��������
	   int array[] = {6,5,4,3,2,1};
	   int tmp;
	   for(int i= 0 ; i<array.length;i++) {
		   for(int j =0 ; j<array.length ; j++) {
			   System.out.println("i :" +i+"j : "+j);
			   if (array[i] > array[j]) {
				   tmp = array[i];
				   array[i]=array[j];
				   array[j]=tmp; 
				   
			   }
			  
		   }
		   
	   }
	   for (int i =0 ; i < array.length ; i++) {
		   System.out.print(array[i]);
	   }
	   
	   */
	   
	   
	   
	   //����Ʈ ��Ʈ��
	   //1) �Է� ��Ʈ�� ���� : ~~InputStream
	   //2) ��� ��Ʈ�� ���� : ~~OutputStream
	   
	   //���� ��Ʈ��
	   //1) �б� ��Ʈ�� ���� : ~~Reader
	   //2) ���� ��Ʈ�� ���� : ~~Writer
	   
	   //page 364
	   //1. ���� ����
	   //writer(���ڴ��� ���� ����)
	   //OutputStream(����Ʈ ���� ���� ����)
	   
	   //class�ȿ��� ���� ������ �����ϳ� �Ұ� �ϳ�. ���ΰ�(�ܵ� ����) ���(�ܵ� �Ұ�)
	   // Constructor�� ��ȣ�� �Ű������� InputStream, OutputStream, Reader, Writer�� ���̸� ���
	   // ������ ���ΰ�
	   
	   //2. ���Ͽ� �� ����
	   // writer �޼ҵ�
	  
	   //3. ���� �б�
	   // Reader �޼ҵ�
	   
	   //4. ���� �ݱ�
	   
	   
	   //page 366 �ǽ� 10-9
/*
	   FileInputStream fis = new FileInputStream("C:\\Users\\son10\\OneDrive - re-contextualize efficient channels\\java_soldesk\\eclipse\\Test01\\test.txt");
	   
	   int ch;
	   while((ch=fis.read())!=-1) {// ������ ���ϰ�� -1�� ��ȯ�Ѵ�. EOF : End Of File : ������ ��
		   System.out.print((char)ch);
	   }
	   fis.close();
*/
	   
//	   public static void main(String[] args) throws IOException {

	   char a = 'S';
	   char b = 'W';
	   
	   char c = 'I';
	   
	   //a.txt ���� a,b,c�� ����.
	   
	   FileWriter tst1 = new FileWriter("test2.txt"); // ���� ����
	   
	   tst1.write(a);
	   tst1.write(b);
	   tst1.write(c);
	   
	   tst1.close();
			   
	   FileWrite1(); // ���� ���� �޼ҵ�
	   FileRead1(); // ���� �б� �޼ҵ�
//	   FileRead2(); // ���� �б� �޼ҵ�
	   
   }
   static void FileWrite1() throws IOException {

	   FileWriter tst1 = new FileWriter("test4.txt");
	   System.out.println("������ ���ڿ��� �Է��ϼ���.");
	   
	   String str1 = tmp.next();
	   tst1.write(str1);
	   
	   tst1.close();
   }
   
   static void FileRead1() throws IOException{
	   char array[] = new char [10];
	   int cnt;
	   FileReader tst2 = new FileReader("test3.txt");
	   
	   cnt = tst2.read(array, 0, array.length);
	   
	   for(int i=0; i>cnt ; i++) {
		   System.out.println(array[i]);
	   }
	   tst2.close();
	   
   }
   //ȥ�ڼ� �׽�Ʈ �ϼ� �ȵ�. page 373 �ǽ� 10-14 ������ �̿��� ���2�� �����ؼ� �ۼ������ҵ�
//   static void FileRead2() throws FileNotFoundException {
//	   FileReader tst1 = new FileReader("test4.txt");
//	   
//	   int str;
//	   while((str = System.in.read)) != 13)
//	   System.out.println(str);
//	   
//   }
   
   
   
   

}

