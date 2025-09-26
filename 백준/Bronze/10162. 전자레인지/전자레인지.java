import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] arr = {300, 60, 10};
        int[] count = {0, 0, 0};
        int num = sc.nextInt();
        if (num % 10 != 0) {
            System.out.println(-1);
        }
        else {
            for (int i=0; i<arr.length; i++) {
            count[i] += num / arr[i];
            num = num % arr[i];
            }
            for (int i : count) {
            System.out.print(i + " ");
            }
        }
        
	}
}
