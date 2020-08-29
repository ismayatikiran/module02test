package inheritance;

public class Nokia1100 extends PreNokia1100 {
    /**
     * Make necessary changes to inherit PreNokia1100
     * Declare and assign value to a String instance variable called nameOfTheClass
     * Implement a method to add photo gallery photoGallery()
     * Create default constructor and a parameterized constructor with int x parameter
     * */
    String nameOfTheClass = "nokia";

    //Adding photos to the Gallery method
    public void photoGallery() {
        System.out.println("adding photos...");
   }
   //Default Constructor
   public void Nokia1100(){
        String x = nameOfTheClass;
       System.out.println("Default variable will show instant variable value" + x);

   }
   //Parameterized Constructor
   public void Nokia1100(String parameterizedC){
       System.out.println(parameterizedC);

   }

    @Override
    public void makeCall() {
        System.out.println("Making Call....");
    }

    @Override
    public void contactList() {
        System.out.println("Checking contacts...");

    }
}
