import java.io.*;
public class Round04_Ex13 {
 public static void main(String[] ar) throws IOException {
	 BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	 
	 
	 String a="";
	 //�Էº�
	 System.out.print("�̸� =");
	 a= in.readLine();
	 System.out.print("���� =");
	 int b=Integer.parseInt(in.readLine());
	 System.out.print("���� =");
	 int c=Integer.parseInt(in.readLine());
	 System.out.print("���� =");
	 int d=Integer.parseInt(in.readLine());	 
	 
	 
	 //��º�
	 System.out.println(a+"�� !! ����� ������ ������ �����ϴ�");
	 System.out.println("����:"+(b+c+d));
	 System.out.println("���:"+(b+c+d)/3f);
	 
	 
 }
}
