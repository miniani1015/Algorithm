import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);

			int N = sc.nextInt();
			String L = sc.nextLine();
			for (int i=1; i<=N; i++) {
				L = sc.nextLine();
				String[] arr = L.split(" ");
				System.out.print("Case #"+i+": ");
				for (int j=arr.length-1; j>=0; j--) {
					System.out.print(arr[j] + " ");

				}
				System.out.println();
			}

	

	}

}