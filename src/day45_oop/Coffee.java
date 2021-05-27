package day45_oop;

public class Coffee {
    /**
     * can be 0 -100 as a percentage
     */
    int amount;
    String type;
    String add;

    @Override
    public String toString() {
        return "Coffee{" +
                "amount=" + amount +
                ", type='" + type + '\'' +
                '}';
    }

    public void refill(){
    amount = 100;

       // System.out.println("current amount " + amount);//or


    }
    public void drink(int someAmount){
        amount -= someAmount;
    }

    public int getAmount() {
        return amount;

    }
    public void setType(String newType){
        type = newType;
    }
    public String getType(){
        return type;
    }
    public String addType(){
        return add;
    }
}
