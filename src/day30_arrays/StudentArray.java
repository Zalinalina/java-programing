package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {

        String[] student1 = new String[5];//when you dont know
        student1[0] = "AD1234";
        student1[1] = "Adam";
        student1[2] = "Smith";
        student1[3] = "B22";
        student1[4] ="5714566541";


       // String[] student1 = {"1234", "Zalina", "Soria", "B22", "5712346567"};

        //                     0         1          2         3         4
        String[] student2 = {"MK4421", "Mike", "Bloomberg", "B22","703-432-1234"};

        System.out.println("student1 id = " + student1[0]);
        System.out.println("student1 firstname =" + student1[1]);
        System.out.println("student1 lastname = " +student1[2]);
        System.out.println("student1 batch num = "+ student1[3]);
        System.out.println("student1 mobile num = "+ student1[4]);


        System.out.println("student dats length: "+ student1.length);

        if (student1.length == 5) {
            System.out.println("PASS: data array has correct length");
        } else {
            System.out.println("FAIL: data array has incorrect length");
        }
            if (student1.length == student2.length) {
                System.out.println("data array length match");
            }else{
                System.out.println("data array length mismatch");
        }


        System.out.println(student1[1].toUpperCase()+ " " + student1[2].toUpperCase());

            String mobileNum = student1[4];
        System.out.println(mobileNum.length());
        System.out.println(mobileNum.startsWith("571"));

    }
}
