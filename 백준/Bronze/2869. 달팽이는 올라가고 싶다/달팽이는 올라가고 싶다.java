import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] parts = br.readLine().split(" ");
		int A = Integer.parseInt(parts[0]);
		int B = Integer.parseInt(parts[1]);
		int V = Integer.parseInt(parts[2]);

		int day = (V - B - 1) / (A - B) + 1;
		System.out.println(day);

	}
}