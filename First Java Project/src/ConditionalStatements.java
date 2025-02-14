import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        // Program to check if user is eligible for voting

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name?: ");
        String name = scanner.nextLine();


        if(name.isEmpty()){ //use isEmpty() like None in Python
            System.out.println("You did not enter your name!");
        }
        else{
            System.out.println("Hello " + name);
            System.out.print("What is your age?");
            int age = scanner.nextInt();

            if(age >=18){
                System.out.println("You are eligible to vote!");
            }
            else if (age < 0){
                System.out.println("You arent even born yet?!");
            }
            else{
                System.out.println("You are a minor. You cannot vote yet.");
            }
        }


        scanner.close();
    }
}
