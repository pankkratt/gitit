public class Calculator {
    Status status;
    private double firstOperand;
    private double secondOperand;
    private char operand;

    public Calculator() {
        status = new Status1(this);
        show(firstOperand);
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public double getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(double secondOperand) {
        this.secondOperand = secondOperand;
    }

    public char getOperand() {
        return operand;
    }

    public void setOperand(char operand) {
        this.operand = operand;
    }

    public void setFirstOperand(double firstOperand) {
        this.firstOperand = firstOperand;
    }

    public double getFirstOperand() {
        return firstOperand;
    }

    public void onPress(char c) {
        status.onPress(c);
    }

    public void show(double operand) {
        System.out.print('\r');
        System.out.print(operand);
        System.out.print("           ");
    }

    public void calculate() {
        switch (operand) {
            case '+':
                firstOperand += secondOperand;
                break;
            case '-':
                firstOperand -= secondOperand;
                break;
            case '*':
                firstOperand *= secondOperand;
                break;
            case '/':
                firstOperand /= secondOperand;
                break;

        }
    }
}
