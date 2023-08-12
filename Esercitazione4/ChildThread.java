
public class ChildThread extends Thread {
    private int n;

    public ChildThread(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 1; i <= n; i++) {
            System.out.println("Attività A (" + i + "/" + n + ")");
            try {
                Thread.sleep((int) (Math.random() * 1000)); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}