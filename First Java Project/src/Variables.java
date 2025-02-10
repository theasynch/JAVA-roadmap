public class Variables {

    public static void main(String[] args) {

        /* This is how to name a variable:
                type name = value;
         */

        int age = 30; //integers
        int year = 2025;
        System.out.println(age);
        System.out.println(year);

        double gpa = 8.34; //floating point data
        double length = 56.87;
        System.out.println(gpa);
        System.out.println(length);

        char string = 'T'; //Only one character allowed in char type
        char symbol = '%';
        System.out.println(string);
        System.out.println(symbol);

        boolean isStudent = false; //conventionally follows camelCase naming
        boolean isGraduated = false;
        System.out.println(isStudent);
        System.out.println(isGraduated);

        if (isStudent){
            System.out.println("The condition is true");
        }
        else{
            System.out.println("The condition is false");
        }

        String name = "Alex";//Standard string type
        String food = "pizza";
        System.out.println(name);
        System.out.println(food);

    }

}
