import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		char ch;
		for (int i=0; i<a.length(); i++) {
			if (Character.isUpperCase(a.charAt(i))) {
				ch = Character.toLowerCase(a.charAt(i));
			}
			else {
				ch = Character.toUpperCase(a.charAt(i));
			}
			System.out.print(ch);
		}
		
	}

}