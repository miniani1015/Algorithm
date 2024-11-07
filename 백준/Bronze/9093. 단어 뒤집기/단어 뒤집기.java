import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			int T = sc.nextInt();
			String dpsxj = sc.nextLine();

			for (int i=0; i<T; i++) {
				String str = sc.nextLine();
				String[] arr = str.split(" ");
				
				for (int j=0; j<arr.length; j++) {
					StringBuilder sb = new StringBuilder(arr[j]);
					System.out.print(sb.reverse()+" ");
				}
				System.out.println();
			}
			
	}

}