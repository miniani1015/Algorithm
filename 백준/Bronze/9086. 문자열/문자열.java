import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		String str;
		
		for (int i=0; i<T; i++) {
			str = scanner.next();
			System.out.println(str.charAt(0)+""+str.charAt(str.length()-1));
			
		}
		
	}

}