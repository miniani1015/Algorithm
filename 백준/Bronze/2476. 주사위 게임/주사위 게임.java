import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        int N = scanner.nextInt();
        int gkq = 0;
        int max = 0; 
        int maxPrize = 0;
        for (int i=0; i<N; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if (a == b && b == c) {
                gkq = 10000 + a * 1000;
            }
            else if (a == b && b != c) {
                gkq = 1000 + a * 100;
            }
            else if (a == c && b != c) {
                gkq = 1000 + a * 100;
            }
            else if (c == b && a != c) {
                gkq = 1000 + b * 100;
            }
            else {
                if (a > max) max = a;
                if (b > max) max = b;
                if (c > max) max = c;
                gkq = max * 100;
            }
            max = 0;
            if (gkq > maxPrize) maxPrize = gkq;
        	
	}
    System.out.println(maxPrize);
}
}