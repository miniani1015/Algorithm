import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String S = scanner.next();
		int i = scanner.nextInt();
		
		System.out.println(S.charAt(i-1));
	}

}