package MyPractice;

public class Movie {
    public static void main(String[] args) {
        String nameOfTheMovie = "Soul";
        String genre = "comedy";
        int duration = 107;
        String releaseDate = "December 25,2020";
        String rating = "PG";
        boolean isSequel = false;
        byte rtr = 95;
        boolean isOnDvd = true ;


        System.out.println("---------- Welcome to the Cinema ----------");
        System.out.println("\tTonight we are streaming \""+ nameOfTheMovie + "\" which was \n released on " + releaseDate +".");
        System.out.println("\tThis "+ genre + " movie got a "+  rtr + "% out of 100%\n rating on Rotten Tomatoes.");
        System.out.println("\tThe rating is " + rating + " and it runs for "+ duration+"\n minutes.");
        System.out.println(" It is a sequel:\t\t " + isSequel + "\n It is on dvd:\t\t\t " + isOnDvd );
    }
}
