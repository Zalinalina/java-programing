package day55_abstraction.exercize_example;

public class AtTheGym {
    public static void main(String[] args) {
        Exersize exersize = new Running() ;
        Running running =new Running();
        Swimming swimming = new Swimming();
        FreeWeight freeWeight = new FreeWeight();
        
        exersize.start();
        exersize.perform();
        System.out.println("Exersize 30 mins - calories" +exersize.getCaloriesCount(30));

       running.start();
        running.perform();
        System.out.println("Running 30 mins - calories" +running.getCaloriesCount(30));

        swimming.start();
        swimming.perform();
        System.out.println("Swimming 30 mins - calories" +exersize.getCaloriesCount(30));

        freeWeight.start();
       freeWeight.perform();
        System.out.println("FreeWeight 30 mins - calories" +freeWeight.getCaloriesCount(30));
                
                
            }

        }


