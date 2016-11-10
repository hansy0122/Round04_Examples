import java.io.*;
public class Round04_Ex13 {
 public static void main(String[] ar) throws IOException {
	 BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	 
	 
	 String a="";
	 //입력부
	 System.out.print("이름 =");
	 a= in.readLine();
	 System.out.print("국어 =");
	 int b=Integer.parseInt(in.readLine());
	 System.out.print("영어 =");
	 int c=Integer.parseInt(in.readLine());
	 System.out.print("수학 =");
	 int d=Integer.parseInt(in.readLine());	 
	 
	 
	 //출력부
	 System.out.println(a+"님 !! 당신의 성적은 다음과 같습니다");
	 System.out.println("총점:"+(b+c+d));
	 System.out.println("평균:"+(b+c+d)/3f);
	 
	 
 }
}
