import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i=0; i<T; i++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			int end = 0;
			
			if (N % H == 0) {
				end += H * 100;
				end += N / H;
			}
			else {
				end += N%H * 100;
				end += N/H + 1;
			}
			System.out.println(end);
		}

	}
}