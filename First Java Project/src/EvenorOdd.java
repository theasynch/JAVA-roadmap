import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int num = scanner.nextInt();

        if (num%2 == 0){
            System.out.println("Entered number "+num+" is an even number");
        }
        else{
            System.out.println("Entered number "+num+" is an odd number");
        }

        scanner.close();
    }

}
