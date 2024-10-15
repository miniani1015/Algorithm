import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String S = scanner.nextLine();
		int[] a = new int[26];
		for (int i=0; i<S.length(); i++) {
			int ch = S.charAt(i) - 'a';
			a[ch]++;
		}
		for (int i=0; i<26; i++) {
			System.out.print(a[i]+ " ");
		}
		
	}

}