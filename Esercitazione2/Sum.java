class Sum extends Thread {
    private int num1;
    private int num2;
    private HoldInteger resultHolder;

    public Sum(int num1, int num2, HoldInteger resultHolder) {
        this.num1 = num1;
        this.num2 = num2;
        this.resultHolder = resultHolder;
    }

    @Override
    public void run() {
        int sum = num1 + num2;
        resultHolder.setValue(sum);
    }
}