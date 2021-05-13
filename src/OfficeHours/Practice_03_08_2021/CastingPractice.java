package OfficeHours.Practice_03_08_2021;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class CastingPractice {
    public static void main(String[] args) {


        // byte - short - int- long - float -  double
        byte b = 10;
        short s = b;
        byte b2 = (byte) s;


        double d = 5.3;
        int i = (short) d;
        int i2 = (int) d;


        float f = 3.54f;
        float f2 = (float) 3.54;// float = (float) double

        float f3 = 5;// float = int - 5.0
        float f4 = 5.5f; // float = double

        long l = 22313; // long=int
        long l2 = 312312313313L;
        //long l3 = (long)312231345623134;//does not work the number is too big for int
        System.out.println(l);
        System.out.println((double)l);
        System.out.println((float)l);
        System.out.println(l2);


        double million = 1_000_000;


        System.out.println();

    }

}
