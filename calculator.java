public class calculator {

    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Usage: java calculator <num1> <num2> <operator>");
            return;
        }

        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        char operator = args[2].charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("Division by zero is not allowed.");
                    return;
                }
                result = num1 / num2;
                break;

            default:
                System.out.println("Invalid operator.");
                return;
        }

        System.out.println("The final result:");
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}

