import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
        int[] sum = new int[N+1];
        int[] array = new int[M];
        for (int i=1; i<=N; i++) {
            sum[i] = sum[i-1] + sc.nextInt();
        }
        for (int i = 0; i<M; i++) {
            int I = sc.nextInt();
            int J = sc.nextInt();
            int num = sum[J] - sum[I-1];
            System.out.println(num);
        }
    }
}