package threadsApplication;

class mythreads2 implements Runnable {
	@Override
	public void run() {	
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("child thread " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}

public class threads2 {
	public static void main(String args[]) {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("hello from the main thread " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}

		mythreads2 m1 = new mythreads2();
		Thread t = new Thread(m1);
		t.start();
	}
}
