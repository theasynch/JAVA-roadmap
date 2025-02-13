import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program to find the fibonacci sequence ");
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int first = 0, second = 1;
        if(num<0){
            System.out.println("Please enter a +ve number");
        }

        else for (int i=0; i<=num; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }

}
