import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		for (int i = 0; i<N; i++) {
			for (int k = 1; k<N-i; k++) {
				System.out.print(" ");
			}
			for (int l = 0; l<=i; l++) {
				System.out.print("*");	
			}
			System.out.println();
		}
		
	}

}