import java.util.Scanner;

public class Main {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int tc = sc.nextInt();
    for (int i=1; i<=tc; i++) {
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println("Case #"+i+": "+A+" + "+B+" = "+(A+B));

        }
	}
}