/**
 * 运算枚举
 */
public enum CalculatorOpEnum {

    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/");



    private String optValue;

    CalculatorOpEnum(String optValue){
        this.optValue = optValue;
    }


}
