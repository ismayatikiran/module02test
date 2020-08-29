package inheritance;

public abstract class PreNokia1100 implements SymbianPhone {
    /**
     * Implement interface SymbianPhone
     * Make necessary changes to make this class abstract
     * <p>
     * Think Nokia company is planning to add a colorful display in future
     * but they cant implement that feature now. This implementation can be done by display()
     * Declare and assign value to a String instance variable called nameOfTheClass
     */
    String nameOfTheClass = "preNokia1100";

    public void sendText() {
        System.out.println("Sending text");
    }

    public abstract void makeCall();

//Display feature
    public void display(String c) {
        c = "colour";
        System.out.println(c);

    }
}
