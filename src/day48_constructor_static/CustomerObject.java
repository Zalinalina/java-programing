package day48_constructor_static;

import java.util.ArrayList;
import java.util.List;

public class CustomerObject {
    public static void main(String[] args) {

        Customer cs1 = new Customer();
        System.out.println(cs1);// print with default values that are set in no-args constructor
        cs1.setId(1);
        cs1.setName("Bob");
        System.out.println(cs1);

        Customer cs2 = new Customer("Mike", 2);
        Customer cs3 = new Customer("John Ward III", 4873);
        System.out.println(cs2);
        System.out.println(cs3);
//array of Customers
        Customer[] todaysCustomer = {cs1, cs2, cs3, new Customer("Zalina", 777)};


        //arrayList of Customer Objects
        List<Customer> customerList = new ArrayList<>();
        customerList.add(cs1);
        customerList.add(cs2);
        customerList.add(cs3);
        customerList.add(new Customer("Zalina", 449));
        customerList.add(new Customer("Sergio", 9763));

//print info of first customer object in array and arraylist
        System.out.println(todaysCustomer[0]);
        System.out.println(customerList.get(0).toString());

        System.out.println(todaysCustomer[1]);
        System.out.println(todaysCustomer[2]);
        System.out.println(todaysCustomer[3]);

    System.out.println(customerList);// print toString() info of all Customer objects

        System.out.println("-------For loop --------");

        for (int i = 0; 0 < customerList.size(); i++) {
            System.out.println(customerList.get(i));
        }

            System.out.println("----- FOR EACH LOOP -----");
            for (Customer eachCustomer : customerList) {
                System.out.println(eachCustomer);
            }
                //print only names of Customers in the list
                System.out.println("-----Names 0f cudtomers -----");
            customerList.forEach(each -> System.out.println(each.getName()));
                for (Customer eachCustomer : customerList) {
                    System.out.println(eachCustomer);

                }

            }

        }
