package day55_abstraction.interface_demo;

public class FirefoxDriver implements WedDriver{

    @Override
    public void get(String url) {
        System.out.println("FireFoxDriver - navigating to " + url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("FireFoxDriver - locating element by " + locator);
    }

    @Override
    public void quit() {
        System.out.println("ChromeDriver - quiting the driver");
    }

    @Override
    public String getTitle() {
        return null;
    }
}
