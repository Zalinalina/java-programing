package MyPractice;

public class utopianTree {
    public static void main(String[] args) {

        int cm = 0;
        int size = 0;

        for (int i = 1; i <= 10; i++) {
            switch (i) {
                case 1:
                case 2:
                case 3:
                    cm = 1;
                    size += cm;
                    System.out.println("year " + i + " - growth " + cm +
                            " cm");

                    System.out.println("tree size: " + size + "cm");
                    break;

                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    cm = 2;
                    size += cm;


                    System.out.println("year " + i + " - growth " + cm +
                            " cm");

                    System.out.println("tree size: " + size + "cm");
                    break;
            }


        }

    }
}