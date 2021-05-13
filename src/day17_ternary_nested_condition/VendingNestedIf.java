package day17_ternary_nested_condition;

public class VendingNestedIf {
    public static void main(String[] args) {
        String selection = "drink";
        String drinkItem = "tea";
        String snackItem = "chips";


        /*
        when selection is "drink":
    "drink option is selected"

    when drink is "tea":
        "tea is selected"
    when drink is "coke":
        "coke is selected"
when selection is "snack"
    "snack option is selected"

    when snack is "chips":
        "chips item is selected"
    when snack is "candy":
        "candy item is selected"
         */
        if(selection.equals("drink")){
            System.out.println("drink option is selected");
            if(drinkItem.equals("tea")) {
                System.out.println("tea item is selected");
            }else{
                System.out.println("coke item is selected");
            }
        }else if (selection.equals("snack")){
            System.out.println("snack option is selected");
            if(snackItem.equals("chips")){
                System.out.println("chips option is selected");
            }else{
                System.out.println("candy option is selected");
            }

        }
    }
}
