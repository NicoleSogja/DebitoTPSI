class Main {
  public static void main(String[] args) {
    final int AMICI = 8;
    final int NUM_KART = 4;
    final int NUM_SPOGLIATOI = 2;

    Kart kart = new Kart(NUM_KART);
    Spogliatoi spogliatoi =new Spogliatoi(NUM_SPOGLIATOI);
    
    for (int i = 0; i < AMICI; i++) {
      Pilota pilota = new Pilota(kart,spogliatoi);
      pilota.start();
    }
  }
}