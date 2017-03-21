package ObjectsAndClasses;

/**
 * Created by djp4830 on 3/21/17.
 */
public class ObjectsAndClasses {

    public static void main(String[] args) {

        dog[] dogArray = new dog[3];

        dogArray[0] = new dog();
        dogArray[0].name = "miles";
        dogArray[0].breed = "Yorkie";
        dogArray[0].color = "Black and Tan";

        dogArray[1] = new dog();
        dogArray[1].name = "lacey";
        dogArray[1].breed = "lab";
        dogArray[1].color = "black";

        dogArray[2]= new dog();
        dogArray[2].name = "buzzo";
        dogArray[2].breed = "sharpei";
        dogArray[2].color = "brown";

        for (int i = 0; i < dogArray.length; i++){
            System.out.println("Dog #" + (i+1) + " - \"" + dogArray[i].name + "\" is a " + dogArray[i].color +
                    " " + dogArray[i].breed);

        }

    }
    

    public static class dog {
        String name;
        String breed;
        String color;
    }


}
