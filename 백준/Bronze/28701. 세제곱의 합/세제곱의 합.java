import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int sum = 0;
		for (int i=1; i<=N; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println(sum*sum);
		sum = 0;
		for (int i=1; i<=N; i++) {
			sum += i*i*i;
		}
		System.out.println(sum);
	}

}