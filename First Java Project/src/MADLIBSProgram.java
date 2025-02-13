import java.util.Scanner;

public class MADLIBSProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter adjective 1: ");
        String adj1 = scanner.nextLine();

        System.out.println("Enter noun 1: ");
        String noun1 = scanner.nextLine();

        System.out.println("Enter adjective 2: ");
        String adj2 = scanner.nextLine();

        System.out.println("Enter noun 2: ");
        String noun2 = scanner.nextLine();

        System.out.println("Enter adj 3: ");
        String adj3 = scanner.nextLine();

        System.out.println("Enter noun 3: ");
        String noun3  = scanner.nextLine();

        scanner.close();

        System.out.println("The "+adj1+" "+noun1+" jumps over the "+adj2+" "+noun2+" and looks like "+adj3+" "+noun3);
    }
}
