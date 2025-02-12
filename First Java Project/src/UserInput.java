import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        /*
        Always first import the input (scanner in java)
        Define the variable for user input like other variables
        Don't forget to close the input using variable.close();
         */


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter you name: ");
        String name = scanner.nextLine();

        System.out.print("What country do you live in: ");
        String first_name = scanner.next(); //doesnt read spaces just one word, gives error for any spaces

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.println("Your name is " + name);
        System.out.println("You live in " +  first_name);
        System.out.println("You are "+ age + " years old");
        System.out.println("Your gpa is "+ gpa);

        scanner.close();
    }

}
