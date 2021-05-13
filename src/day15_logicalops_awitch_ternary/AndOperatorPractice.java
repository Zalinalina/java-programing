package day15_logicalops_awitch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeShipping = true;
        String itemName = "Wooden spoon";

        if (onSale && freeShipping) {
            System.out.println("Adding to cart - "+ itemName);
        }else {
            System.out.println("Continue shopping for good deals on - "+ itemName);
        }
       //add to cart only if it is freeShipping, onSale, itemName is Wooden spoon
        if(freeShipping && onSale && itemName.equals ("Wooden spoon" )) {
            System.out.println("Add to cart - " + itemName);
        }else{
            System.out.println("Continue shopping for good deals on - "+ itemName);
        }




    }
}
