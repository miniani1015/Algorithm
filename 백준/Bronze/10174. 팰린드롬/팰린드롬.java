import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String n = scanner.nextLine();
		int tc = Integer.parseInt(n);
		String str;
		Boolean rltBoolean=false;

		for (int i=0; i<tc; i++) {
			str = scanner.nextLine();
			rltBoolean = check(str.toLowerCase());
			System.out.println((rltBoolean==true)? "Yes":"No");
		}
	}
	
	public static boolean check(String str) {
		int spoint = 0;
		int epoint = str.length()-1;
		
		while(spoint < epoint) {
			char a = str.charAt(spoint++);
			char b = str.charAt(epoint--);
			if (a!=b) return false;
		}
		return true;
	}
}