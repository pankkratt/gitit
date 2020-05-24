public class Status1 extends Status {

    public Status1() {
        super();

    }

    public Status1(Calculator calculator) {
        super(calculator);
    }

    @Override
    void onPress(char ch) {
        int digit = Character.getNumericValue(ch);
        if (digit >= 0 && digit < 10) {
            calculator.setFirstOperand(calculator.getFirstOperand() * 10 + digit);
        }
    }

    public static void main(String[] args) {
        Status status = new Status1();
        status.onPress('4');
        status.onPress('а');
        status.onPress('a');
        status.onPress('b');
        status.onPress('c');
        status.onPress('0');
        status.onPress('A');
        status.onPress('Z');
        status.onPress('3');
        status.onPress('$');
    }

}
