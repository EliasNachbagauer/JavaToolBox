package primeQuantity;

public class PrimeQuantity {

	public int[] calculate(int a) {
		int out[] = new int[a];
		for (int i = 1; i <= a; i++) {
			int help = a % i;
			if (help == 0) {
				out[i] = i;
			}
		}
		return out;
	}
}
