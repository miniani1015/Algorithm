import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		String s = "";
		s += a;
		s += b;
		
		System.out.println(a + b - c);
		System.out.println(Integer.parseInt(s) - c);
		

	}
}