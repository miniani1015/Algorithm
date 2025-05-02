import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i=0; i<num; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> li = new ArrayList<Integer>();
        for (int i=0; i<num; i++) {
            li.add(arr[i], i+1);
        }
        for (int i=num-1; i>=0; i--) {
            System.out.print(li.get(i) + " ");
        }

    }
}