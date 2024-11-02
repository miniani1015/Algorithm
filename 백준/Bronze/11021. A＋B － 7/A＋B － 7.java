import java.util.Scanner;

public class Main {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int tc = sc.nextInt();
    int[] a = new int[tc];
    for (int i=1; i<=tc; i++) {
        int A = sc.nextInt();
        int B = sc.nextInt();
        a[i-1] = A+B;

        }
    for (int i=1; i<=tc; i++) {
    System.out.println("Case #"+i+": " + a[i-1]);    	
    }

	}
}