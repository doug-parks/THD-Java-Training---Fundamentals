package ObjectsAndClasses;

/**
 * Created by djp4830 on 3/22/17.
 */
public class NameMain {

    public static void main(String[] args) {

        Name Doug = new Name("Doug", "Parks");
        Name Homer = new Name("Homer", "Bucket");
        Name JohnDoe = new Name();

        Doug.printName();
        Homer.printName();
        JohnDoe.printName();

    }
}
