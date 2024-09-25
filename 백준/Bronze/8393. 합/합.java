import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int number = 0;
		
		for (int i = 1; i<=n; i++) {
			number = i + number; 
		}
		System.out.println(number);

	}

}