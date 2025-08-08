import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int sum = 0;
        int[] arr = new int[K];
        for (int i=0; i<K; i++) {
        	arr[i] = sc.nextInt();
        }
        for (int i=0; i<K; i++) {
        	if (arr[i] == 0) {
        		int dnlcl = i; 
        		while (arr[dnlcl] == 0) {
        			dnlcl--;
        		}
        		arr[dnlcl] = 0;
        	}
        }
        for (int i=0; i<K; i++) {
        	sum += arr[i];
        }
        System.out.println(sum);
    }
}