package day22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {
        //                     01234      12          23              41 43
        String technologies = "java, html, css, selenium, testing, maven, cucumber";
        System.out.println(technologies.indexOf(","));//4  so "," = 4 acchi (first comma)
        System.out.println(technologies.lastIndexOf(","));//41 last comma
        System.out.println(technologies.indexOf("u"));//23
        //for middle one, we need to loop
//                                              0   start with first letter
        int indexOfJava = technologies.indexOf("java");
        //
        System.out.println("java is an index " + indexOfJava);//0
//
        int idxOfCss = technologies.indexOf("css");
        System.out.println("css is at index " + idxOfCss);//12

        int indexOfCucumber = technologies.indexOf("cucumber");//43
        System.out.println("cucumber is at index " + indexOfCucumber);

        int indexOfSql = technologies.indexOf("sql");//not present -1
        System.out.println("sql is it index " + indexOfSql);

        //technologies.contains("maven")
        if (technologies.contains("maven")) {
            System.out.println("maven is present");
        } else {
            System.out.println("maven is not present");
        }

        if (technologies.indexOf("maven") > -1) {
        System.out.println("maven is present");
    }else {
            System.out.println("maven is not present");

        }
    }
}
