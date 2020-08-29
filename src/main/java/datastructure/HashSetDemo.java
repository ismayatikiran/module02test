package datastructure;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    /**
     * @author Jahidul Islam
     * Create HashSet and store data
     * Get the data from HashSet and print
     * Get the data from HashSet and insert it in db table
     *
     * */

    public void employeName() {

        Set<String> name = new HashSet<String>();
        name.add("Vijay Kumar");
        name.add("Shakil Arora");
        name.add("Omar ALi");
        name.add("Asif Uddin");
        name.add("Iqbal Hossain");

        for (String employeeN : name) {
            System.out.println(employeeN);
        }
    }
}
