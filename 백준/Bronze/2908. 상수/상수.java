import java.util.Scanner;

public class Main { 

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int A = sc.nextInt();
	int B = sc.nextInt();
	int a = A / 100;
	int b = A % 10;
	int c = A % 100 - b;
	int d = B / 100;
	int e = B % 10;
	int f = B % 100 - e;
	A = b*100 + c + a;
	B = e*100 + f + d;
	if (A>B) {
		System.out.println(A);
	}
	else {
		System.out.println(B);
	}
	}
}