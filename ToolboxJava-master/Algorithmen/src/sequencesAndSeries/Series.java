package sequencesAndSeries;

public class Series {

	public int[] arithmetish(int[] sequenze) {
		int[] out = new int[sequenze.length];
		for (int i = 0; i<sequenze.length;i++) {
			out [i]=(out[i]+sequenze[i+1])*(i/2);
		}
		return out;
	}
}
