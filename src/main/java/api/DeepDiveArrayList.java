package api;

import java.util.ArrayList;
import java.util.List;

public class DeepDiveArrayList {

    /**
     * @author Jahiudl Islam
     * ArrayList JDK 8 API documantation to be read and ArrayList source code to be viewed
     * Demonastrate your understanding on ArrayList after reading the document
     * You are free to document your understanding using comment
     *
     * */
    public void studentList(){
        //Declearing an List Type
    List<Object> studentNameID  = new ArrayList<>();
    //Signing vales to the Arraylist object Variable
    studentNameID.add("101, Vicky");
    studentNameID.add("102, Shella");
    studentNameID.add("103, Mila");
    studentNameID.add("104, Mala");
    studentNameID.add("105, jonny");

    //How to get value of the one out of the list
        System.out.println("Get value of 1: "+studentNameID.get(1));

        //How to find size of the Array
        System.out.println("Getting size of the list: "+studentNameID.size());

        //How to replace one value instead of the othe value
        studentNameID.add(2,"106, Molly");
        System.out.println("Adding new value in index 2 106 and Name Molly"+studentNameID.get(3));

    }


}
