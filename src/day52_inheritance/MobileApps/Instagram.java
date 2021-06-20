package day52_inheritance.MobileApps;

public class Instagram extends MobileApp {

    public void postPhoto() {
        System.out.println("Posting photo on instagram");

    }

    @Override
    public void useTheApp(int minutes) {
       // useTheApp(minutes);
        super.useTheApp(minutes);

        System.out.println("Using instagram app features ");
        postPhoto();


    }
}
