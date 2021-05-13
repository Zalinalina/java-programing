package day19_class_vs_object_string;

public class StringStartsWithEndsWith {
    public static void main(String[] args) {
        String word = "Spring";
        System.out.println(word.startsWith("S"));
        System.out.println(word.endsWith("g"));
        System.out.println(word.startsWith("s"));


        String newWord = "intellij idea";
        System.out.println(newWord.startsWith("i"));//true
        System.out.println(newWord.startsWith("in"));
        System.out.println(newWord.startsWith("intellij"));
        System.out.println(newWord.startsWith("intellij idea"));
        System.out.println("java".startsWith("j"));


        System.out.println(newWord.startsWith("Int"));//false case sensetive

        System.out.println(newWord.endsWith("idea"));//true
        System.out.println(newWord.endsWith("intellij idea"));
        System.out.println(newWord.endsWith("a"));

        String name = "Irina";
        if (name.endsWith("a")) {
            System.out.println("Maybe it is a female name");
        }

        String firstName = "Mr. Nadir";
        if (firstName.startsWith("Mr.")) {
            System.out.println("Man");
        } else if (firstName.startsWith("Dr.")){
        System.out.println("Doctor");
        }else if(firstName.startsWith("Mrs.")){
        System.out.println("Married women");
        }else if(firstName.startsWith("Ms.")){
            System.out.println("Single women");
        }else if(firstName.startsWith("Sr.")) {
            System.out.println("Senior");
        }else {
            System.out.println("Normal name");
        }


            String url = "https://www.irs.gov";
            if (url.endsWith(".com")){
            System.out.println("Commercial website");
            }else if(url.endsWith(".ru")){
                System.out.println("Russian website");
            }else if(url.endsWith(".gov")){
                System.out.println("Goverment website");
            }else if(url.endsWith(".edu")){
                System.out.println("Education website");
            }else if(url.endsWith(".org")){
                System.out.println("Organization website");
            }

        }
    }

