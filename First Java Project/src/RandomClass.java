import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {

        Random random = new Random();

        int num;
        double floatingpt;
        boolean isHeads;

        //Generating an unbounded integer gives a value between -2bln and +2bln
        num = random.nextInt();
        System.out.println(num);

        //Add bounds to print random between a specific range. Example rolling a die
        num = random.nextInt(1,7); //Bound value isnt included in the value
        System.out.println(num);


        //Generating a random double by default gives a value between 0 and 1
        floatingpt = random.nextDouble();
        System.out.println(floatingpt);

        //Adding bounds generate specific decimal values
        floatingpt = random.nextDouble(1,4);
        System.out.println(floatingpt);

        //You can also generate random true false (0,1) with this
        isHeads = random.nextBoolean();
        if (isHeads){
            System.out.println("Heads!");
        }
        else {
            System.out.println("Tails");
        }




    }
}
