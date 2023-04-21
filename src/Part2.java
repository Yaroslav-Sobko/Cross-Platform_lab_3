import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Part2 {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Частина 2\n");
		System.out.println("Введіть x:");
		double x = Double.parseDouble(input.readLine());
		double f = Func.series(x, 0.00001);
		double f_real = Math.pow(Math.cos(x), 3);
		System.out.println("f = " + f + "\nf_real = " + f_real + "\n|f - f_real| = " + Math.abs(f - f_real));
	}
}