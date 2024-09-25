import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		
		for (int i = 0; i<T; i++) {
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				
				System.out.println(a+b);
		}

		
	}

}