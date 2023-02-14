package Day22_Thread_problems;

class Worker extends Thread{
    int[] nums = {0,1,2,3,4};
    public void run(){
        for (int num : nums){
            System.out.println("Worker " + num);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class ThreadProblem {
    public static void main(String[] args) {
        int alp = 'a';
        Worker w = new Worker();
        w.start();
        try {
            while (w.isAlive()) {
                System.out.println("Main : " + (char) alp++);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
        }
    }
}

