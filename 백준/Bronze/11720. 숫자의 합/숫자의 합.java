import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int sum = 0;
		String str = scanner.next();
		
		for (int i=0; i<N; i++) {
			int a = str.charAt(i) - '0';
			sum += a;
		}
		System.out.println(sum);
	}

}