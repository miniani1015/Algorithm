import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		for (int i=0; i<5; i++) {
			int A = sc.nextInt();
			A *= A;
			num += A;
		}
		System.out.println(num % 10);
	
	}
}