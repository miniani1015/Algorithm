import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int count1 = 0;
		int count2 = 0;
		for (int i=0; i<N; i++) {
			int num = scanner.nextInt();
			for (int j=1; j<=num; j++) {
					if (num%j==0) {
						count1++;
						}
			}
			if (count1 == 2) count2++;
			count1=0;			
		}
		System.out.println(count2);
	}
}