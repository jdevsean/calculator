/**
 * 基本四则运算
 */
public class Calculator {

    private int total;

    public Calculator() {
        total = 0;
    }

    public void cal(CalculatorOpEnum calculatorOpEnum, int num) {
        switch (calculatorOpEnum) {
            case ADD:
                total += num;
                break;
            case SUBTRACT:
                total -= num;
                break;
            case MULTIPLY:
                total *= num;
                break;
            case DIVIDE:
                total /= num;
                break;
        }
        System.out.println("结果是:" + total);
    }

}
