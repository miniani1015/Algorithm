import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.next();
		int count = 0;
		for (int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if (ch=='a' || ch =='e'|| ch =='i'|| ch =='o'|| ch =='u') {
				count++;
			}
			
		}
		System.out.println(count);

	}

}