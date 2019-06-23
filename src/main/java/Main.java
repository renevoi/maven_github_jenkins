import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number:");
        double firstNum = scanner.nextDouble();
        System.out.print("Enter the operation sign");
        char operation = scanner.next().charAt(0);
        System.out.print("Enter second number:");
        double secondNum = scanner.nextDouble();

        double result=0.0;

        switch (operation) {
            case '+':
                result = firstNum + secondNum;
                System.out.printf("%.1f %c %.1f = %.1f", firstNum, operation, secondNum, result);
                break;
            case '-':
                result = firstNum - secondNum;
                System.out.printf("%.1f %c %.1f = %.1f", firstNum, operation, secondNum, result);
                break;
            case '*':
                result = firstNum * secondNum;
                System.out.printf("%.1f %c %.1f = %.1f", firstNum, operation, secondNum, result);
                break;
            case '/':
                result = firstNum / secondNum;
                System.out.printf("%.1f %c %.1f = %.1f", firstNum, operation, secondNum, result);
                break;
            default:
                System.out.println("Please select a valid operation");
        }

    }
}
