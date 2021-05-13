package day10_shorthand_operators;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class changeVariableValue {
    public static void main(String[] args) {
        int count = 3;
        System.out.println("count =" + count);
        //increase count by 2
        count = count +2;
        System.out.println("count =" + count);

        double rent = 1500;
        rent = rent + 250;
        System.out.println(rent);

        double dressPrice = 150;
        dressPrice = dressPrice - 30;
        System.out.println("Price for dress with discount: $" + dressPrice);
        
        int apples = 5;
        System.out.println("apples = "+ apples);
        apples = apples +10;
        System.out.println("apples = " + apples);//15
        apples = apples - 3;
        System.out.println("apples = " + apples);
        
        int pizzaSlices = 8;
        System.out.println("pizzaSlices = " + pizzaSlices);
        pizzaSlices = pizzaSlices / 2;//4
        System.out.println("pizzaSlices = " + pizzaSlices);//4
        // get another whole small pizza just for you = 6 slices
        pizzaSlices = pizzaSlices +6;
        System.out.println("pizzaSlices = " + pizzaSlices);//6+4=10
        
        
        int players = 10;
        System.out.println("players = " + players);
        players = players *2;
        System.out.println("players = " + players);//10*2=20
        
        
        int cents = 9568;
        System.out.println("cents = " + cents);
        //keep whole dollars portion and just assign remaining cents
        cents = cents % 100;
        System.out.println("remaining cents = " + cents);// 68 vents ostatok



    }
}
