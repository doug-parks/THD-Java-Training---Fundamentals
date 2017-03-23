package ObjectsAndClasses;

/**
 * Created by djp4830 on 3/22/17.
 */
public class Name {

    private String fName;
    private String lName;

    public Name(){
        fName = "no";
        lName = "name";
    }


    public Name(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }


    public void printName(){
        System.out.println(fName + " " + lName);
    }


}
