package Day22_Thread_problems3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadProblem3 {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        Runnable task = () -> {
            try {
                for (int i = 0; i < 5; i++){
                    System.out.println("Worker " + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            exec.shutdown();
        };
        exec.submit(task);

        int alp = 'a';
        try {
            while (!exec.isShutdown()) {
                System.out.println("Main : " + (char) alp++);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

