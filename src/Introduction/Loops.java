package Introduction;

/**
 * Created by djp4830 on 3/16/17.
 */
public class Loops {

    public static void main(String[] args) {

        //for loop
        System.out.println("For Loop: \n");
        for (int i = 1; i<= 10; i++){
            System.out.println(i);
        }

        //while loop
        int i = 1;
        System.out.println("\nWhile Loop: \n");
        while (i <= 10 ){
            System.out.println(i);
            i++;
        }

        //do-while loop
        i = 1;
        System.out.println("\nDo-While Loop:\n");

        do {
            System.out.println(i);
            i++;
        } while (i<=10);


    }
    }
