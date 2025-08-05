import java.util.List;

class CalculatorConundrum {

    private static final List<String> operations = List.of(new String[]{"+", "*", "/"});

    public String calculate(int operand1, int operand2, String operation) throws IllegalArgumentException{
        try {
            if (operation == null) {
                throw new IllegalArgumentException("Operation cannot be null");
            } else if (operation.isEmpty()) {
                throw new IllegalArgumentException("Operation cannot be empty");
            }

            int result;
            switch (operation) {
                case "+":
                    result = operand1 + operand2;
                    break;
                case "*":
                    result = operand1 * operand2;
                    break;
                case "/":
                    result = operand1 / operand2;
                    break;
                default:
                    throw new IllegalOperationException("Operation '" + operation + "' does not exist");
            }

            return operand1 + " " + operation + " " + operand2 + " = " + result;

        } catch (ArithmeticException e) {
            throw new IllegalOperationException("Division by zero is not allowed", e);
        }
    }

}
