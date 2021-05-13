package MyPractice;
import java.util.Scanner;
public class shoppingList2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String item = "";
        String shoppingListReport = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter Item " + count + " and its price:");
            item = scan.next();
            price = scan.nextDouble();
            totalPrice += price;
            shoppingListReport +=  "Item" + count +": " + item+ " Price: " + price + ",";
            count++;
            System.out.println("Add one more item?");
            countinue = scan.next();
            if (countinue.equals("no")) {

                break;
            }
                if (countinue.equals("yes")) {
                    continue;


                }



            }
        shoppingListReport=shoppingListReport.substring(0,shoppingListReport.lastIndexOf(","));
        System.out.println(shoppingListReport);
        System.out.println("Total price: " + totalPrice);
        }
    }
