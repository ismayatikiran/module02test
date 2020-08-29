package problems;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
    Anagram anagram = new Anagram();
    anagram.findAnagram();


    }
    public void findAnagram(){
        // find whether this word is anagram or not

        Scanner in =new Scanner(System.in);

        String CAT = in.nextLine();
        String ACT = in.nextLine();
        String ARMY = in.nextLine();
        String MARY = in.nextLine();

        char arr1[] = CAT.toCharArray();
        char arr2[] = ACT.toCharArray();
        char arr3[] =ARMY.toCharArray();
        char arr4[] =MARY.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);
        Arrays.sort(arr4);

        String Array1 = new String(arr1);
        String Array2 = new String(arr2);
        String Array3 = new String(arr3);
        String Array4 = new String(arr4);



        if(Array1.equals(Array2)){
            System.out.println("It is Anagram");
        }
        else{
            System.out.println("It is not an Anagram");
        }


//        if (Array3.equals(Array4)){
//            System.out.println("It is Anagram");
//        }
//        else{
//            System.out.println("2nd one is not an Anagram also");
//        }

    }
}
