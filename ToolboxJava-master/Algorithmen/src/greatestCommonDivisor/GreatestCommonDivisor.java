package greatestCommonDivisor;

public class GreatestCommonDivisor {

	public int euclidean(int a, int b) {
		int out = 0;

		if (a == 0) {
			out = b;
		} else {
			do {
				if (a > b) {
					a = a - b;
				} else {
					b = b - a;
				}
			} while (b != 0);
			out = a;
		}

		return out;
	}

	public int euclideanRec(int a, int b) {
		int out = 0;

		if (b == 0) {
			out = a;
		} else if (a == 0) {
			out = b;
		} else if (a > b) {
			out = euclideanRec(a - b, b);
		} else {
			out = euclideanRec(a, b - a);
		}

		return out;
	}

	public int primeQuantity(int a, int b) {
		int out = 0;
		int run;

		int aa[] = new int[a];
		int ba[] = new int[b];

		// search for the prime quantity from number a
		for (int i = 1; i <= a; i++) {
			int help = a % i;
			if (help == 0) {
				aa[i] = i;
			}
		}

		// search for the prime quantity from number b
		for (int i = 1; i <= b; i++) {
			int help = b % i;
			if (help == 0) {
				ba[i] = i;
			}
		}

		// finds the biggest prime quantity from number a
		int maxA = 0;
		for (int i = 0; aa.length > i; i++) {
			if (aa[i] > maxA) {
				maxA = aa[i];
			}
		}

		// finds the biggest prime quantity from number b
		int maxB = 0;
		for (int i = 0; ba.length > i; i++) {
			if (aa[i] > maxB) {
				maxB = aa[i];
			}
		}

		// set the output to the bigger prime quantity from a and b
		if (maxA > maxB || maxA == maxB) {
			out = maxA;
		} else {
			out = maxB;
		}

		return out;
	}

	
}
