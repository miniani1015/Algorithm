import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);		

		int N = scanner.nextInt();
		int X = scanner.nextInt();
		int[] number = new int[N];
		for (int i=0; i<N; i++) {
			number[i] = scanner.nextInt();
		}
		
		for (int i=0; i<N; i++) {
			if (number[i] < X) {
				System.out.print(number[i] + " ");
			}
		}

	}

}