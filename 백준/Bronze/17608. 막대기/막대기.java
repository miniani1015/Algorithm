import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			int N = sc.nextInt();
			int a[] = new int[N];
			int count = 1;

			for (int i=0; i<N; i++) {
				a[i] = sc.nextInt();
			}
			int max = a[N-1];
			
			for (int j=N-1; j>=1; j--) {
				if (max < a[j-1]) {
					count++;
					max = a[j-1];
				}
			}
			System.out.println(count);

	}

}