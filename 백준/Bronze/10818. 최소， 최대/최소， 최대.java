import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);		
	
		int min = 1000000;
		int max = -1000000;
		int N = scanner.nextInt();

		for (int i=0; i<N; i++) {
			int number = scanner.nextInt();
			if (number < min) {
				min = number;
			}
			if (number > max) {
				max = number;
			}
		}
		System.out.print(min + " " + max);
	}

}