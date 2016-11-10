 import java.io.*;
public class Round04_Ex07 {
 public static void main(String[] ar) throws IOException{
	 System.out.print("키보드 하나를 누르세요: ");
	 int a =System.in.read();
	 char b=(char)a;
	 
	 System.out.println(a);
	 System.out.println(b);
	 System.in.read();  
	 System.in.read();  //위에 두개를 합쳐서 맨 위에 부분에 BufferedReader in= new BufferedReader(new InputStreamReader(System.in)) 선언 후 여기에 in.readLine() 을 선언하면 됨
	                     // 그럴경우 in. readLine() 이  엔터키 까지의 테이터 값을 먹어버림. 물론 앞에 한글자는 System.in.read();에 귀속 될것임.
	 
	 System.out.print("숫자를 하나 입력하세요: ");
	 int c = System.in.read()-48; //'0'
	 System.out.println(c);
 }
}
