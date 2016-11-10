
public class Round04_Ex06 {
public static void main(String[] ar){
	System.out.write(65);
	System.out.flush();
	System.out.println();
	byte[] by= new byte[]{'j','v','a','v'};
	
	System.out.write(by,0,4);
	System.out.println();
	
	int a=100;
	char b='A';
	float c=12.346F;
	String d="ÇÑ½Â¿±";
	System.out.printf("a= %d ÀÔ´Ï´Ù. \n", a);
	System.out.printf("b=%d=%c\n", (int)b,b);
	System.out.printf("ÇÑ½Â¿±=%s\n", d);
	System.out.printf("c=%.2f\n", c);
	
}
}
