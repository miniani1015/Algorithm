import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i=0; i<T; i++) {
            int znjxj = 0;
            int ekdla = 0;
            int slzpf = 0;
            int vpsl = 0;
        	int C = scanner.nextInt();
        	if (C >= 25) {
        		znjxj = C / 25;
        		C = C % 25;
        	}
        	if (C >= 10) {
        		ekdla = C / 10;
        		C = C % 10;
        	}
        	if (C >= 5) {
        		slzpf = C / 5;
        		C = C % 5;
        	}
        	if (C >= 1) {
        		vpsl = C / 1;
        		C = C % 1;
        	}
        	System.out.print(znjxj + " ");
        	System.out.print(ekdla + " ");
        	System.out.print(slzpf + " ");
        	System.out.println(vpsl);
        }

    }
}