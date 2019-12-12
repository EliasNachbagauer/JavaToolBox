/**
 * 
 */
package thread;

/**
 * @author elias
 *
 */
public class MyThread extends Thread {

	private String text;

	public MyThread(String text) {
		this.text = text;
	}

	public void run() {
		// Sample Code
		for (int i = 0; i < 10; i++) {
			try {
				sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {

			}
			System.out.println(text);
		}
	}
}
