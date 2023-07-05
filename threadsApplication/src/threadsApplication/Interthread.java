
package threadsApplication;

class Consumer {
    int amount = 1000;
    private final Object lock = new Object();
// it declares a private instance varaible "lock" of type "object", it is used as lock object for a synchronization
    void withdraw(int amount) {
        synchronized (lock) {
            System.out.println("Going to withdraw");
            if (this.amount < amount) {
                System.out.println("Insufficient funds waiting to deposit");
                try {
                    lock.wait();// this line puts the current thread in the waiting state until another thread calls
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            this.amount -= amount;
            System.out.println("Withdraw Completed");
        }
    }

    void deposit(int amount) {
        synchronized (lock) {
            System.out.println("Going to deposit money");
            this.amount += amount;
            System.out.println("Deposit Completed");
            lock.notify();
        }
    }
}

public class Interthread {
    public static void main(String args[]) {
        final Consumer c = new Consumer();
        new Thread() {
            public void run() {
                c.withdraw(11000);
            }
        }.start();
        new Thread() {
            public void run() {
                c.deposit(5000);
            }
        }.start();
    }
}


	
