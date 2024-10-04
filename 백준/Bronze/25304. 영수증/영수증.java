import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int won = 0;
		int X = scanner.nextInt();
		int N = scanner.nextInt();
		
		for (int i=0; i<N; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			won += a*b;
		}
		if (won == X) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}