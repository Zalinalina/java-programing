public class SaimsTaskLoops {
    public static void main(String[] args) {
        String book = "Java textbook By Murodil. Chapter 1 datatypes and variables." +
                " Chapter 2 conditional statements. chapter 3 String manipulation. Chapter 4 Loops." +
                " Chapter 5 Arrays. Chapter 6 Methods. chapter 7 ArrayList. chapter 8 instance and static." +
                " Chapter 9 Constructors. Chapter 10 Encapsulation and Inheritance. Chapter 11 Abstraction and " +
                "jPolymorphism. Chapter 12 Exceptions. Chapter 13 Collections. Chapter 14 Learn more.";
        int count = 0;
        double price;
        String book1 = book.toLowerCase();


        while (book1.indexOf("chapter")>-1) {
            count++;
            int index = book1.indexOf("chapter");
            book1 = book1.substring(index+1);
        }

        price = count * 10;
        System.out.println("price = " + price);
    }
}





