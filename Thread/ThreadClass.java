package Thread;

public class ThreadClass extends Thread{
        int number;
        public ThreadClass(int number) {
            this.number = number;
        }
        @Override
        public void run() {
            System.out.println("Welcome to Thread - " + number);
        }
        public static void main(String[] args) {
            for (int i = 1; i <= 5; i++) {
                ThreadClass thread = new ThreadClass(i);
                thread.start();
            }
        }
    }


