import java.util.Scanner;

public class Main { 

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int TC = sc.nextInt();
    double vudrbs = 0;
    double[] arr = new double[TC];
    for (int i=0; i<TC; i++) {
    	arr[i] = sc.nextInt();
    }
    double max = 0;
    for (int i=0; i<TC; i++) {
    	if (arr[i] > max) max = arr[i];
    }
    for (int i=0; i<arr.length; i++) {
    	vudrbs += arr[i]/max*100;
    }
    System.out.println(vudrbs / TC);
	}
}