package day55_abstraction.interface_demo;

public interface WedDriver {
    public abstract void get(String url);
    public abstract void findElement (String locator);
    void quit(); //it is automatomatically public abstract
    String getTitle();
}
