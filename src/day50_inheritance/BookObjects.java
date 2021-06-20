package day50_inheritance;

public class BookObjects {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "Intro to java";
        book.author = "Savitch";
        book.type ="programming";
        book.price = 85.0;
        //book.pages = 40;/Error


        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.type);
        System.out.println(book.price);


        Audiobook audiobook = new Audiobook();
        audiobook.author = "Unmesh";
        audiobook.length = 60;
        audiobook.narrator = "Irina";
        audiobook.price = 44.99;
        audiobook.title = "Selenium cookbook";
        audiobook.type = "Automation";
        audiobook.listen();


        Ebook ebook = new Ebook();
        ebook.title = "Java data structure";
        ebook.title = "Savitch";
        ebook.type ="programming";
        ebook.price = 85.0;
        ebook.pages = 1000;
        ebook.readbook();




    }
}
