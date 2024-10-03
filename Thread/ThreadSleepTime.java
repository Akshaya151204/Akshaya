package Thread;

public class ThreadSleepTime extends Thread {
    int sleepTime;
    public ThreadSleepTime(int sleepTime) {
        this.sleepTime = sleepTime;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(sleepTime);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        int sleepTime = 500;
        Thread thread = new Thread(new ThreadSleepTime(sleepTime));
        thread.start();
        System.out.println("Finished printing numbers.");
    }
}

