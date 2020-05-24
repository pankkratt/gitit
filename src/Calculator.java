public class Calculator {
    Status status = new Status1(this);
    private double firstOperand;

    public void setFirstOperand(double firstOperand) {
        this.firstOperand = firstOperand;
    }

    public double getFirstOperand() {
        return firstOperand;
    }
}
