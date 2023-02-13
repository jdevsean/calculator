public class Main {

    public static void main(String[] args) {
        CalculateExecutor executor = new CalculateExecutor();
        Calculator calculator = new Calculator();
        CalculatorCommand command = new CalculatorCommand(calculator, CalculatorOpEnum.ADD, 1);
        executor.calculate(command);

        executor.undo(1);

        executor.redo(1);
    }
}
