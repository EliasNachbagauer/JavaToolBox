package fibonacci;

import java.math.BigInteger;

/**
 * This class provides a fibonacci calculator
 * 
 * @author enach
 *
 */

public class Fibonacci {

	public BigInteger calculate(int number) {
		BigInteger prepre = new BigInteger("0");
		BigInteger pre = new BigInteger("1");
		BigInteger out = new BigInteger("1");

		if (number >= 2) {
			for (int i = 3; i <= number; i++) {
				prepre = pre;
				pre = out;
				out = prepre.add(pre);
			}
		}
		return out;
	}

}
