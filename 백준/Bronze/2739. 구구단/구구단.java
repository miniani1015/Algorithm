import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int i = 1;
		
		for (i = 1; i < 10; i++) {
				System.out.println(N + " * " + i + " = " + N*i);	
		}

	}

}
