package thread;

public class RunThread {
	public static void main(String[] args) {
		MyThread thread1, thread2, thread3;

		thread1 = new MyThread("1");
		thread2 = new MyThread("2");
		thread3 = new MyThread("3");

		thread1.start();
		thread2.start();
		thread3.start();

	}
}
