class Counter {
    private int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class ThreadD extends Thread {
    Counter counter;

    ThreadD(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.increment();
        }
    }
}

public class TaskMT5 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        ThreadD t1 = new ThreadD(counter);
        ThreadD t2 = new ThreadD(counter);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + counter.getCount());
    }
}
