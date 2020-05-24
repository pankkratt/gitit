abstract public class Status {
    protected Calculator calculator;

    public Status(){}

    public Status(Calculator calculator) {
        this.calculator = calculator;
    }

    abstract void onPress(char ch);
}
