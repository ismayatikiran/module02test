package datastructure;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    /**
     * @author Jahidul Islam
     * Create a Map reference variable and store information as you like
     * Show me all possible retrieval process
     * Store map in DB
     *
     * */
    public void studentinformation() {
        HashMap<Integer, String> studentNameID = new HashMap<Integer, String>();
    studentNameID.put(2010,"Shelly Hossain");
        studentNameID.put(2012,"Monsur Ali");
        studentNameID.put(2013,"Happy Hssan");
        studentNameID.put(2014,"Nasima Begum");
        studentNameID.put(2015,"Jolly Sign");

        System.out.println("List of Information of the Studen"+studentNameID);
        System.out.println("How many in total Students"+studentNameID.size());
        System.out.println("Get Studen ID 2014 Name:"+ studentNameID.get(2014));

        System.out.println("\n"+"List of the all the students:");

        for (Map.Entry<Integer,String> informationList : studentNameID.entrySet()){
            System.out.println(informationList.getKey()+" : "+ informationList.getValue());
        }


    }
}
