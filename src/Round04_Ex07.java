 import java.io.*;
public class Round04_Ex07 {
 public static void main(String[] ar) throws IOException{
	 System.out.print("Ű���� �ϳ��� ��������: ");
	 int a =System.in.read();
	 char b=(char)a;
	 
	 System.out.println(a);
	 System.out.println(b);
	 System.in.read();  
	 System.in.read();  //���� �ΰ��� ���ļ� �� ���� �κп� BufferedReader in= new BufferedReader(new InputStreamReader(System.in)) ���� �� ���⿡ in.readLine() �� �����ϸ� ��
	                     // �׷���� in. readLine() ��  ����Ű ������ ������ ���� �Ծ����. ���� �տ� �ѱ��ڴ� System.in.read();�� �ͼ� �ɰ���.
	 
	 System.out.print("���ڸ� �ϳ� �Է��ϼ���: ");
	 int c = System.in.read()-48; //'0'
	 System.out.println(c);
 }
}
