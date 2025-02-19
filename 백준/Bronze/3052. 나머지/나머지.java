import java.util.Scanner;

public class Main { 

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] a = new int[10];
	int count = 0;

	for (int i=0; i<10; i++) {
		int A = sc.nextInt();
		A = A % 42;
		a[i] = A;
	}
	for (int i=0; i<10; i++) {
		int minicount = 0;	
		for (int j=0; j<=i; j++) {
			if (a[i] != a[i-j]) {
				minicount++;
			}
		}
		if (minicount == i) count++;
	}
	System.out.println(count);
	}
}