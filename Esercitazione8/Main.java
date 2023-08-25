class Main {
  public static void main(String[] args) {
    CokeMachine macchinetta= new CokeMachine();
    new Rifornitore(macchinetta).start();
    new Utente(macchinetta,5).start();
    new Utente(macchinetta,5).start();
    
  }
}