import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = scanner.nextDouble();

        double sum = a+b;
        double difference = a-b;
        double product = a*b;
        double quotient = a/b;
        double moduli = a%b;

        System.out.println("The sum a+b = "+sum);
        System.out.println("The sum a-b = "+difference);
        System.out.println("The sum a*b = "+product);
        System.out.println("The quotient a/b = "+quotient);
        System.out.println("The moduli a%b = "+moduli);

        scanner.close();
    }

}
