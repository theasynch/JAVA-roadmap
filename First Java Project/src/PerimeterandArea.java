import java.util.Scanner;

public class PerimeterandArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lets calculate the area and perimeter of a rectangle!");

        System.out.print("Enter the length of a rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        double area = length*width;
        double perimeter = 2*(length+width);
        System.out.println("The area of the rectangle with given measurements is: "+ area);
        System.out.println("The perimeter of the rectangle with given measurements is: "+ perimeter);

        scanner.close();
    }

}
