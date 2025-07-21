import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		int wjdekq = 0;
		for (int i=0; i<8; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i=0; i<8; i++) {
			if (arr[i] == i+1) {
				wjdekq++;
			}
		}
		if (wjdekq == 8) {
			System.out.println("ascending");
		}
		else {
			wjdekq = 0;
			for (int i=8; i>0; i--) {
				if (arr[8-i] == i) {
					wjdekq++;
				}
			}
			if (wjdekq == 8) {
				System.out.println("descending");
			}
			else {
				System.out.println("mixed");
			}
			
		}
		

	}
}