package loops;

public class Loops {

	// Loops run as long as the Argument is true.

	public void whileLoop() {
		/*
		 * This Loop manly used for actions that should run in background.
		 */

		int count = 0;
		while (count < 10) {
			System.out.println("" + count);
			count++;
		}
	}

	public void doWhileLoop() {
		/**
		 * The difference between the while and the doWhile loop is that this loop runs
		 * the code and tests afterwards if it should run the code again.
		 */

		boolean run = true;
		int count = 0;
		do {
			System.out.println("Hello World");
			if (count == 3) {
				run = false;
			}
		} while (run == true);
	}

	public void forLoop() {
		/**
		 * This loop is manly for counting ore iterate arrays or lists. It creates its
		 * own run Variable in the argument
		 */

		for (int i = 0; i < 10; i++) {
			System.out.println("Hello World" + i);
		}

		int[] array = new int[5];

		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}

	}

}
