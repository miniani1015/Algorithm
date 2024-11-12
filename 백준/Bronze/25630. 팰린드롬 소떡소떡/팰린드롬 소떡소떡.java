import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			
			int count = 0;

			int n = scanner.nextInt();
			String N = scanner.next();		

			for (int i=0; i<n/2; i++) {
				int ch1 = N.length() - (N.length()-i);
				int ch2 = N.length() - i - 1; 
				if (N.charAt(ch1) != N.charAt(ch2)) {
					count++;
				}
			}
			System.out.println(count);
		}

}