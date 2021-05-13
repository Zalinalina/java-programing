package day39_wrapper_classes;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ParseString {
    public static void main(String[] args) {
        String total = "345";
        int count = Integer.parseInt(total);
        System.out.println("count = " + count);


        String strPrice = "123.99";
        double price = Double.parseDouble(strPrice);
        System.out.println("price = " + price);
        // if (price > 100.0){
        //  System.out.println("expensive");
        System.out.println(price > 100);


        String sentence = "I wrote 50 lines of code";
        String[] words = sentence.split(" ");
        int linesOfCode = Integer.parseInt(words[2]);
        System.out.println("linesOfCode = " + linesOfCode);
    }
}


