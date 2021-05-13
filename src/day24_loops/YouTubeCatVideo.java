package day24_loops;

public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting: World's smallest cat \uD83D\uDC08 BBC video");
        int seconds = 0;
        while (seconds < 117){
           // seconds++;
            System.out.println("Watching YouTube \uD83D\uDC08 video: "+seconds);
            seconds++;
           // Thread.sleep(1000);//to fix error put mouse on error and choose first option
            Thread.sleep(500);// faster than second

        }
        System.out.println("Finished watching Cat \uD83D\uDC08 video.\nLets start another one");




        }
    }

