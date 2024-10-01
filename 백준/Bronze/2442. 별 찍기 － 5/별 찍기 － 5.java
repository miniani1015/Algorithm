import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		for (int i=1; i<=N; i++) {
			for (int k=0; k<N-i; k++) {
				System.out.print(" ");
			}
			for (int j=0; j<2*i-1; j++) {
				System.out.print("*");
			}
		System.out.println("");
		}
			
	}

}