import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			int tc = sc.nextInt();

			for (int i=0; i<tc; i++) {
				String str = sc.next();
				int combo = 0;
				int point = 0;
				for (int j=0; j<str.length(); j++) {
					if (str.charAt(j) == 'O') {
						point += combo + 1;
						combo++;
					}
					else if (str.charAt(j) == 'X') {
						combo = 0;
					}
				}
				System.out.println(point);
			}
		}
}