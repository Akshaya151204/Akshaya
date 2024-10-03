public class ThreadRunnable implements Runnable {
    public int start;
    public int end;
    public ThreadRunnable(int start, int end) {
        this.start = start;
        this.end = end;
    }
    @Override
    public void run() {
        for (int i = start; i <= end; i++)
            System.out.println(i);
    }
    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadRunnable(1,5));
        Thread thread1 = new Thread(new ThreadRunnable(6,10));
        thread.start();
        thread1.start();
        System.out.println("All numbers printed.");
    }
}

