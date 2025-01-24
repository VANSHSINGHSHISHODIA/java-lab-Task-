public class Calculator {
    public static void main(String[] args){
         if (args.length != 3) {
            System.out.println("Usage: java CommandLineCalculator <num1> <operation> <num2>");
            System.out.println("Operations: + for addition, - for subtraction, * for multiplication");
            return;

         }

         try {
            // Parse the command-line arguments
            int num1 = Integer.parseInt(args[0]);
            String operation = args[1];
            int num2 = Integer.parseInt(args[2]);
              int result;
            switch (operation) {
                case "+":
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case "-":
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case "*":
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                default:
                    System.out.println("Invalid operation. Use +, -, or *.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please provide integers.");
        }
    }
}

    