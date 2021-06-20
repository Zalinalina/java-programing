package day52_inheritance.MobileApps;

public class Discord extends MobileApp {
    public void chat(String someone) {
        System.out.println("Chating with "  +someone + " on Discord");
    }

    /**
     *
     * override download method
     */
    @Override
    public boolean download() {
        System.out.println("Downloaded Discoed 0.0.23 from App Store");
        return true;
    }


    @Override
    public void useTheApp(int minutes){
        super.useTheApp(minutes);
       // System.out.println("Using Discord app chat ");
        chat("Vladislav");
    }
    public void printInfo() {
        System.out.println("App Name = " + getName());
        System.out.println("App Version = " + getVersion());
    }
}
