public class Status1 extends Status {
    public Status1(Calculator calculator) {
        super(calculator);
    }

    @Override
    void onPress(char ch) {
        pause();
        int digit = Character.getNumericValue(ch);
        if (digit >= 0 && digit < 10) {
            calculator.setFirstOperand(calculator.getFirstOperand() * 10 + digit);
            calculator.show(calculator.getFirstOperand());
        } else if(operators.contains(ch)) {
            calculator.setOperand(ch);
            calculator.setStatus(new Status2(calculator));
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.onPress('4');
        calculator.onPress('0');
        calculator.onPress('3');
        calculator.onPress('-');
        calculator.onPress('6');
        calculator.onPress('7');
        calculator.onPress('4');
        calculator.onPress('*');
        calculator.onPress('3');
        calculator.onPress('5');
        calculator.onPress('2');
        calculator.onPress('+');
        calculator.onPress('4');
        calculator.onPress('0');
        calculator.onPress('3');
        calculator.onPress('-');
        calculator.onPress('6');
        calculator.onPress('7');
        calculator.onPress('4');
        calculator.onPress('*');
        calculator.onPress('3');
        calculator.onPress('5');
        calculator.onPress('2');
        calculator.onPress('+');

    }

}
