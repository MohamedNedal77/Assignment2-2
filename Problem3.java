import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = in.nextDouble();
        System.out.print("Enter operator: ");
        char op = in.next().charAt(0);
        System.out.print("Enter second number: ");
        double b = in.nextDouble();
        double result;
        switch (op) {
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/':
                if (b == 0) {
                    System.out.println("Error: division by zero");
                    return;
                }
                result = a / b;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }
        System.out.println("Result: " + result);
    }
}
