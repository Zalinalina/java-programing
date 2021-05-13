package day29_nestedloop_arrays;

public class CountCharNestedLoop {
    public static void main(String[] args) {

        String word = "java";
        String checked = "";
        for (int outer = 0; outer < word.length(); outer++) {
            System.out.println("outer: " + word.charAt(outer));
            int count = 0;

            for (int inner = 0; inner < word.length(); inner++) {
                if (word.charAt(outer) == word.charAt(inner)) {
                    count++;
                   // checked+=word.charAt(inner){
                   // if(word.charAt(outer)>=1){
                       // continue;
                   // }
                    // System.out.println(word.charAt(inner));
                }
                if(!checked.contains(word.charAt(outer)+"")){
                checked+=word.charAt(outer)+" = "+count+"\n";

            }
            //System.out.println(word.charAt(outer) + "=" +count);
                //System.out.println(inner);
        }

    }
        System.out.println(checked);
}
}