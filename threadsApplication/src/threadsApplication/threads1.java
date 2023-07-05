package threadsApplication;
class mythreads extends Thread{
	public void run() {
		System.out.println("Hello from the child thread");
	}
		
}
public class threads1 {
	public static void main(String args []) {
		System.out.println("Hello from the main thread");
		mythreads t = new mythreads();
		
		t.start();
	}
}
