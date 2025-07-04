import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char N = str.charAt(i);
            if (N == 'A' || N == 'B' || N == 'C') {
                sum += 3;
            }
            else if (N == 'D' || N == 'E' || N == 'F') {
                sum += 4;
            }
            else if (N == 'G' || N == 'H' || N == 'I') {
                sum += 5;
            }
            else if (N == 'J' || N == 'K' || N == 'L') {
                sum += 6;
            }
            else if (N == 'M' || N == 'N' || N == 'O') {
                sum += 7;
            }
            else if (N == 'P' || N == 'Q' || N == 'R' || N == 'S') {
                sum += 8;
            }
            else if (N == 'T' || N == 'U' || N == 'V') {
                sum += 9;
            }
            else if (N == 'W' || N == 'X' || N == 'Y' || N == 'Z') {
                sum += 10;
            }
        }
        System.out.println(sum);
    }
}