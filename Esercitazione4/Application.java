public class Application {
    public static void main(String[] args) {
        System.out.println("Thread principale: Avvio del thread figlio...");
        ChildThread childThread = new ChildThread(5);
        childThread.start();

        int checks = 0;
        while (childThread.isAlive()) {
            checks++;
            System.out.println("Thread principale: Controllo " + checks + ", il thread figlio è ancora vivo.");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Thread principale: Il thread figlio è terminato dopo " + checks + " controlli.");
    }
}