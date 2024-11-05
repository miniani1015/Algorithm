import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String N = sc.nextLine();
			if (N.equals("END")) break;
			for (int i=N.length()-1; i>=0; i--) {
				System.out.print(N.charAt(i));			
			}
			System.out.println("");
			
		}

	}

}