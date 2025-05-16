import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp;

        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }

        int gcd = GCD(b, a%b);

        System.out.println(gcd);
        System.out.println((a*b)/gcd);
    }
    public static int GCD(int a, int b) {
        if (b==0) return a;
        else return GCD(b, a%b);
    }
}