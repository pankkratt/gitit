public class Status2 extends Status {
    public Status2(Calculator calculator) {
        super(calculator);
    }

    @Override
    void onPress(char ch) {
        pause();
        int digit = Character.getNumericValue(ch);
        if (digit >= 0 && digit < 10) {
            calculator.setSecondOperand(calculator.getSecondOperand() * 10 + digit);
            calculator.show(calculator.getSecondOperand());
        } else if(operators.contains(ch)) {
            calculator.calculate();
            calculator.show(calculator.getFirstOperand());
            calculator.setSecondOperand(0);
            calculator.setOperand(ch);
        }
    }
}
