package Introduction;
import java.util.Scanner;


/**
 * Created by djp4830 on 3/17/17.
 */
public class Arrays {

    public static void main(String[] args) {

        //Exercise: find the sum of all integers in an array

        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            System.out.println(sum);
        }

        //Exercise: find the largest element in the above array
        int largest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest){
                largest = array[i];
            }

        }
        System.out.println("\nThe largest number is: " + largest);

        //Exercise: find how many characters are repeated in a string

        String string = "hellooo";
        int counter = 0;

        for (int i = 0; i < string.length()-1; i++){
            if (string.charAt(i) == string.charAt(i+1)){
                counter++;
            }
        }
        System.out.println("\nYour string \"" + string + "\" has " + counter + " repeated characters.");



    }
}
