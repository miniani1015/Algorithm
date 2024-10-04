import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int count = 0;
		int N = scanner.nextInt();
		int[] number = new int[N];
		for (int i=0; i<N; i++) {
			number[i] = scanner.nextInt();
		}
		int v = scanner.nextInt();
		
		for (int i=0; i<N; i++) {
			if (number[i] == v) {
				count += 1;
			}
		}
		System.out.println(count);
	}

}