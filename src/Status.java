import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

abstract public class Status {
    protected Calculator calculator;
    protected Set<Character> operators;

    public Status(Calculator calculator) {
        this.calculator = calculator;
        operators = Stream.of('+', '-', '*', '/')
                .collect(Collectors.toCollection(HashSet::new)); // TODO: 5/25/2020 to study
    }

    public void pause() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    abstract void onPress(char ch);
}
