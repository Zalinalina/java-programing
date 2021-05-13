package MyPractice;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(Palindrome("anna"));
    }
    public static boolean Palindrome(String word){
        boolean isPalindrome = true;
        for(int i = 0; i < word.length()/2;i++){
            if(word.charAt(i)== word.charAt(word.length()-1-i)) {
            }else{
                return false;
            }
        }
        return isPalindrome;
    }
}
