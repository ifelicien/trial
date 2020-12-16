import java.util.Scanner;

public class pythagorean {
    public Scanner input = new Scanner(System.in);

    public void getdata(){
        System.out.println("The pythagorean theorem consists of a triangle whose two legs when squared are equal to the hypotenuse squared:\n");

        System.out.println("Please enter leg A");
        int numA = input.nextInt();

        System.out.println("\nPlease enter leg B");
        int numB = input.nextInt();

        System.out.println("\nPlease enter Hypotenuse");
        int numC = input.nextInt();

        int sq_A = (int) Math.pow(numA, 2);
        int sq_B = (int) Math.pow(numB, 2);
        int sq_C = (int) Math.pow(numC, 2);

        int totalAB = sq_A + sq_B;

        if(totalAB == sq_C){
            System.out.println("\nThe squared total of leg A and B is equal to square C: " + totalAB + " = " + sq_C);
        }
        else{
            System.out.println("\nThis does not follow the pythagorean theorem");
        }

    }
}
