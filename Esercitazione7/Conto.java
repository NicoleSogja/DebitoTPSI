public class Conto{
  private double saldo;
  public Conto(double saldo){
    this.saldo=saldo;
  }

  public synchronized void prelievo(double importo){
    if(saldo-importo>=0){
      saldo-=importo;
      System.out.println();
    }else{
      System.out.println();
    }
  }
  public synchronized void deposito(double importo) {
        saldo += importo;
        System.out.println();
        notifyAll();
    }
  public synchronized double getSaldo(){
    return saldo;
  }
  
}