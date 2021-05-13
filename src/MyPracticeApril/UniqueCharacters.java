package MyPracticeApril;

public class UniqueCharacters {
    public static void main(String[] args) {
        String word = " aaannnhhhyyyggffddeerrttyyiii";
        String unique = "";

        for (int i = 0; i < word.length(); i++){
        if(!unique.contains( word.charAt(i) + "")){
            unique+=word.charAt(i);

        }

    }
        System.out.println(unique);
    }
}
