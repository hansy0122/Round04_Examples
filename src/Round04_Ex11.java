import java.io.*;
public class Round04_Ex11 {
	public static void main(String[] ar) throws IOException {
		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("boolean �ڷḦ �Է��ϼ���: ");
		String imsi= in.readLine();
		boolean bool=Boolean.valueOf(imsi).booleanValue();
		System.out.print(bool);
	}
}
