import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int su = A*B*C;
		String str = Integer.toString(su);
        
		for (int i=0; i<10; i++) {
			sum = 0;
			for (int j=0; j<str.length(); j++) {
				if (i == str.charAt(j)-'0') {
					sum++;
				}
			}
			System.out.println(sum);
		}

	}
}