public class Application{
  public static void main(String[] args){
    System.out.println("Sono il thread Principale");
    MyThread pippo = new MyThread("Pippo");
    MyThread caio = new MyThread("Caio");
    pippo.start();
    caio.start();
  }
}