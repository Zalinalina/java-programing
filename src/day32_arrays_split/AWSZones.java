package day32_arrays_split;

import java.util.Arrays;

public class AWSZones {
    public static void main(String[] args) {
        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";

        System.out.println("----Starting deployment of etsy app to AWS  zones-----------");
        String[] zonesArray = zones.split(",");
       //System.out.println("comas in the sentence " +(zonesArray.length-1));
       // String[] zonesArray = zones.split("-");
      // System.out.println("- in the sentence " +(zonesArray.length-1));

        for(String eachZone : zonesArray){
          // System.out.println(eachZone);


            System.out.println("Deploying ["+app + "] to " + eachZone + "...");
            System.out.println("Deployment completed for " + eachZone + "...");

        }
        //System.out.println(Arrays.toString(zonesArray));//array string just to see

        System.out.println("------All deployments completed ---------");




    }
}
