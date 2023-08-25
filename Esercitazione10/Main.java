public class Main {
  public static void main(String[] args) {
      long tempoMax = 0;
      double accuracy = 0;

      Thread t = new Thread(() -> {
        double pi = 0.0;
        int termIndex = 0;

        while (true) {
          double term = 1.0 / (2 * termIndex + 1);

          if (termIndex % 2 == 0) {
            pi += term;
          } else {
            pi -= term;
          }

          termIndex++;

          if (Math.abs(Math.PI - pi * 4) < accuracy) {
            System.out.println("Precisione raggiunta.");
            System.out.println("Valore approssimato di pigreco: " + pi * 4);
            break;
            }

            if (Thread.currentThread().isInterrupted()) {
              System.out.println("Thread interrotto.");
              System.out.println("Valore approssimato di pigreco: " + pi * 4);
              break;
            }
          }
      });

      t.start();

      try {
        Thread.sleep(tempoMax);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      t.interrupt();
    }
}
