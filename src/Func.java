public class Func {
	static double factorial(int n) {// тут був інт)
		if(n > 1)
			return n * factorial(n - 1);
		else
			return 1;
	}
	static double series(double x, double eps) {
		double sum = 0;
		double u = 0;
		for (int k = 0; k < 100; k++) {
			u = Math.pow(-1.0, k) * (Math.pow(9, k) + 3) / factorial(2 * k) * (Math.pow(x, 2 * k));
			if (Math.abs(u) < eps) {
				System.out.println("n = " + k);
				break;
			}
			sum += u;
		}
		return sum /= 4;
	}


}
