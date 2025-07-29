import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			if (x == 0) {
				if (y == 0) {
					if (z == 0) {
						break;
					}
				}
			}
			if (x > y && x > z) {
				if (x*x == y*y + z*z) {
					System.out.println("right");
				}
				else {
					System.out.println("wrong");
				}
			}
			else if (y > x && y > z) {
				if (y*y == x*x + z*z) {
					System.out.println("right");
				}
				else {
					System.out.println("wrong");
				}
			}
			else if (z > x && z > y) {
				if (z*z == x*x + y*y) {
					System.out.println("right");
				}
				else {
					System.out.println("wrong");
				}
			}
			else {
				System.out.println("wrong");
			}
			
		}

	}
}