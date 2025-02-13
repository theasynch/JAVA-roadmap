import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program to find the factorial of entered num!!");
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        if(num == 0){
            System.out.println("Factorial of 0 is always 1");
        }
        else if (num < 0) {
            System.out.println("Factorial of negative integers does not exist");

        }
        else{
            long fac = 1;
            for (int i = 1; i<=num; i++){
                fac *= i;

            }
            System.out.println(fac);
        }
    }
}
