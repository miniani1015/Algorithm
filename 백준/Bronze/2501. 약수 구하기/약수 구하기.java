import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		int count = 0;
	
		
		for (int i=1; i<=N; i++) {
			if (N%i==0) {
				count++;
				if (count == K) {
					System.out.println(i);
					break;
				}				
			}
		}
		if (count < K) System.out.println(0);
	}
}