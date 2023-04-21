import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		System.out.println("Частина 1\n");
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int N = 0;
		do {
			System.out.println("Введіть N:");
			N = Integer.parseInt(input.readLine());
		} while (N <= 0);
		int sum = 0;
		for (int i = 0; i <= N; i++) {
			sum += (N + i) * (N + i);
		}
		System.out.println("SUM = " + sum);
	}
}