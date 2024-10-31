import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[5];
		for (int i=0; i<5; i++) {
			a[i] = scanner.nextInt();
		}
		Arrays.sort(a);
		System.out.println((a[0]+a[1]+a[2]+a[3]+a[4]) / 5);
		System.out.println(a[2]);
	}

}
