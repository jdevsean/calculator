import java.util.ArrayList;
import java.util.List;

/**
 * 运算执行人
 */
public class CalculateExecutor {

    private List<CalculatorCommand> commands = new ArrayList<CalculatorCommand>();
    private int count = 0;

    public void calculate(CalculatorCommand calculatorCommand) {
        calculatorCommand.calculate();
        count++;
        commands.add(calculatorCommand);
    }

    public void redo(int redoMax) {
        for (int i = 0; i < redoMax; i++) {
            if (count < commands.size()) {
                count++;
                commands.get(count - 1).calculate();
            }
        }
    }

    public void undo(int undoMax) {
        for (int i = 0; i < undoMax; i++) {
            if (count > 0) {
                commands.get(count - 1).rollback();
                count--;
            }
        }
    }
}
