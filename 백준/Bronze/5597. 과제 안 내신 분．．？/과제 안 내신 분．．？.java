import java.util.Scanner;

public class Main { 

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	    int[] a = new int[29];
	    int counter = 0; 
	    for (int i=1; i<=28; i++) {
	    	a[i] = sc.nextInt();
	    }
	    for (int i=1; i<=30; i++) {
	    	for (int j=1; j<=28; j++) {
	    		if (i == a[j]) {
	    			counter++;
	    		}
	    	}
	    	if (counter == 0) System.out.println(i);
	    	counter = 0;
	    }
	}
}