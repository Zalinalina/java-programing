package day50_inheritance;

public class Ebook extends Book {
    int size, pages;

    public void readbook() {
        System.out.println("Reading book : ");
        System.out.println("title = " + title);
        System.out.println("author = " + author);
        System.out.println("price = " + price);
        System.out.println("size = " + size);
        System.out.println("pages = " + pages);
        System.out.println();
    }
}