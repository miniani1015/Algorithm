import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int arr[][] = new int[100][100];
        int N = sc.nextInt();
        int sum = 0;

        for (int i=0; i<N; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            for (int j=a; j<a+10; j++) {
                for (int z=b; z<b+10; z++) {
                    arr[z][j]++;
                }
            }
        }
        for (int i=0; i<100; i++) {
            for (int j=0; j<100; j++) {
                if (arr[j][i] > 0) sum++;
            }
        }
        System.out.println(sum);
    }
}