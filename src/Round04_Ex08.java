import java.io.*;
public class Round04_Ex08 {
	public static void main(String[] ar) throws IOException {
		byte[] by= new byte[10];
		System.out.print("좋아하는 사람은?: ");
		System.in.read(by);
		System.out.println("결과:" +new String(by));
		
	}
}
