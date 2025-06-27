import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String[] arr = new String[5];
        String str = "";
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextLine();
        }
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i < arr[j].length()) {
                    str += arr[j].charAt(i);
                }
            }
            
        }
        System.out.println(str);
    }
}