package day38_methods;

public class StringUtils {
    public static void main(String[] args) {
        System.out.println("isNullorEmoty(\"hello\") = " + isNullorEmpty("hello"));
        String word = null;
        System.out.println("isNullorEmoty(word) = " + isNullorEmpty(word));
        word = "";
        System.out.println("isNullorEmoty(word) = " + isNullorEmpty(word));
    }


    public static boolean isNullorEmpty(String str) {
        return (str == null || str.isEmpty());
//        if (str == null || str.isEmpty()){
//        return true;
//    }
//        return false;


    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static String reverse(String str){
      //  StringUtils.reverse("java");
        String reversed = "";
        for (int i = str.length()-1; i >= 0; i-- ){
            reversed+=str.charAt(i);
        }
        return reversed;
    }
}

