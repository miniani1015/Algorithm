import java.util.Scanner;

public class Main {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt() - 1;
    int counter = 0;
    while (0<N) {
        N -= counter*6;
        counter++;
    }
    if (counter > 1) {
        System.out.println(counter);
    }
    else {
        System.out.println(1);
    }

    }
}