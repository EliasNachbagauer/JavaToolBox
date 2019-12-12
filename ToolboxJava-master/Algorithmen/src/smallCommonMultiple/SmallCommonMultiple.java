package smallCommonMultiple;

public class SmallCommonMultiple {

	public int multisets(int a, int b) {
		int out = 0;
		int aa[] = new int[a * b];
		int ba[] = new int[a * b];

		for (int i = 1; i <= a * b; i++) {
			aa[i] = a * i;
			ba[i] = a * i;
		}

		for (int i = 0; i < aa.length; i++) {
			for (int j = 0; j < ba.length; j++) {
				if (aa[i] == ba[j]) {
					out = aa[i];
				}
			}
		}

		return out;
	}
}
