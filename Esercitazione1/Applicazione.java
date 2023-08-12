public class Applicazione {
  public static void main(String[] args) {
    Printer thread1 = new Printer('*');
    Printer thread2 = new Printer('#');

    thread1.start();
    thread2.start();
  }
}