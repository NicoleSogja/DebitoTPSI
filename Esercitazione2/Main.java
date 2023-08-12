
public class Main {
    public static void main(String[] args) {
        int num1, num2;

        System.out.print("Inserisci il primo numero: ");
        num1 = Integer.parseInt(System.console().readLine());

        System.out.print("Inserisci il secondo numero: ");
        num2 = Integer.parseInt(System.console().readLine());

        HoldInteger resultHolder = new HoldInteger();
        Sum sum = new Sum(num1, num2, resultHolder);

        sum.start();

        try {
            sum.join();  
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int result = resultHolder.getValue();
        System.out.println("La somma è: " + result);
    }
}
