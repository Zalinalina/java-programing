package day29_nestedloop_arrays;

public class StringNestedLoop {
    public static void main(String[] args) {
        //             0123 chatAt
        String word = "java";
        //             1234 length
        for (int i = 0; i < word.length(); i++) {//or i = 1 and i<=word.length()
            for (int j = 0; j <= i; j++) {
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }
        for (int i = 0; i < word.length(); i++) {//or i = 1 and i<=word.length()
            for (int j = i; j < word.length(); j++) {
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }
        for (int a = 0; a < word.length(); a++) {
            char outerChar = word.charAt(a);
            int count = 0;
            for (int b = 0; b < word.length(); b++) {
                char innerChar = word.charAt(b);

                if (outerChar == innerChar) {
                    count++;
                }

        }
            System.out.println(outerChar + "=" + count);
        }
    }
    }