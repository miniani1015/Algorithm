import java.util.Scanner;

public class Main { 

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int[] arr = new int[N];
	int M = sc.nextInt();
	for (int i=0; i<M; i++) {
		int I = sc.nextInt();
		int J = sc.nextInt();
		int K = sc.nextInt();
		for (int j=I-1; j<=J-1; j++) {
			arr[j] = K;
		}
	}
	for (int i=0; i<N; i++) {
		System.out.print(arr[i] + " ");
	}
	}
}