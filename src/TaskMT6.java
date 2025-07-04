class SafeCounter {
    private int count = 0;

    // Synchronized method to make it thread-safe
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class ThreadD2 extends Thread {
    SafeCounter counter;

    ThreadD2(SafeCounter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.increment();
        }
    }
}

public class TaskMT6 {
    public static void main(String[] args) {
        SafeCounter counter = new SafeCounter();

        ThreadD2 t1 = new ThreadD2(counter);
        ThreadD2 t2 = new ThreadD2(counter);

        t1.start();
        t2.start();

        try {
            t1.join(); // Wait for thread 1 to finish
            t2.join(); // Wait for thread 2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + counter.getCount());
    }
}
