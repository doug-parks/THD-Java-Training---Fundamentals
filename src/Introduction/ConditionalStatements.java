package Introduction;
import java.util.Scanner;
/**
 * Created by djp4830 on 3/16/17.
 */
public class ConditionalStatements {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your score.");

        int value = input.nextInt();
        if (value < 0 || value > 100){
            System.out.println("The score you entered is invalid. Please enter again. ");
        }

        if (value >= 90 && value <= 100) System.out.println("You have an A!");
        else if (value >= 80 && value <= 89) System.out.println("You have a B!");
        else if (value >= 70  && value <= 79) System.out.println("You have a C!");
        else if (value >= 60  && value <= 69) System.out.println("You have a D!");
        else if (value >= 60) System.out.println("You have failed!!");

    }
}
