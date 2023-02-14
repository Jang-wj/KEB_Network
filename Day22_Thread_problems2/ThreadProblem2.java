package Day22_Thread_problems2;

public class ThreadProblem2 {
    public static void main(String[] args) {
        Thread w = new Thread( () -> {
            try {
                for (int i = 0; i < 5; i++){
                    System.out.println("Worker " + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        w.start();

        int alp = 'a';
        try {
            while (w.isAlive()) {
                System.out.println("Main : " + (char) alp++);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

