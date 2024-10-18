import java.util.Scanner;

public class Main {

public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);

    int A = scanner.nextInt();
    int B = scanner.nextInt();
    System.out.println(A*(B%10));
    int C = A*(B%10);
    System.out.println(A*(B%100/10));
    int D = A*(B%100/10)*10;
    System.out.println(A*(B/100));
    int E = A*(B/100)*100;
    System.out.println(C+D+E);
    }
}