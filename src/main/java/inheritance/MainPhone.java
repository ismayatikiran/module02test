package inheritance;

public class MainPhone extends Nokia1100 {

    public static void main(String[] args) {
        MainPhone mainPhone =new MainPhone();
        mainPhone.photoGallery();
        mainPhone.Nokia1100();
        mainPhone.Nokia1100("Parameterized Constructor");
        mainPhone.makeCall();
        mainPhone.sendText();
        mainPhone.contactList();

    }
}