/**
 * 计算器执行命令
 */
public class CalculatorCommand {

    private Calculator calculator;
    private int num;
    private CalculatorOpEnum operation;

    public CalculatorCommand(Calculator calculator, CalculatorOpEnum operation, int num) {
        this.calculator = calculator;
        this.num = num;
        this.operation = operation;
    }

    /**
     * 执行运算
     */
    public void calculate() {
        calculator.cal(operation, num);
    }

    /**
     * 运算回测
     */
    public void rollback() {
        calculator.cal(rollbackOp(operation), num);
    }

    private CalculatorOpEnum rollbackOp(CalculatorOpEnum operation) {
        CalculatorOpEnum rollbackOpVal = null;
        switch (operation) {
            case ADD:
                rollbackOpVal = CalculatorOpEnum.SUBTRACT;
                break;
            case SUBTRACT:
                rollbackOpVal = CalculatorOpEnum.ADD;
                break;
            case MULTIPLY:
                rollbackOpVal = CalculatorOpEnum.DIVIDE;
                break;
            case DIVIDE:
                rollbackOpVal = CalculatorOpEnum.MULTIPLY;
                break;
        }
        return rollbackOpVal;
    }

}
