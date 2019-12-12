package sequencesAndSeries;

public class Sequence {

	public int[] arithmetish(int start, int k, int number) {
		int out[] = new int[number];
		for (int i = 0; i <= number; i++) {
			out[i] = start + k * i;
		}

		return out;

	}

	public int[] gerografic(int start, int q, int number) {
		int out[] = new int[number];
		for (int i = 0; i <= number; i++) {
			int help = q;
			for (int j = 1; j <= i; j++) {
				help = help * help;
			}
			out[i] = start * help;
		}
		return out;
	}
}
