public class Calculator {
    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int calculate(int firstOperand, int secondOperan, char operator) {

        switch (operator) {
            case ADDITION:
                return firstOperand + secondOperan;
            case SUBTRACTION:
                return firstOperand - secondOperan;
            case MULTIPLICATION:
                return firstOperand * secondOperan;
            case DIVISION:
                if (secondOperan != 0)
                    return firstOperand / secondOperan;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}