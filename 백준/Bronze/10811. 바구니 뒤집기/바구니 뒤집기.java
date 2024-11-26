import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int[] arr = new int[N+1];
		
		for (int i=1; i<=N; i++) {
			arr[i] = i;
		}
		for (int i=0; i<M; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			for (int j=0; j<=(b-a)/2; j++) {
				int t = arr[a+j];
				arr[a+j] = arr[b-j];
				arr[b-j] = t;
			}
		}
		for (int i=1; i<=N; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}