package OfficeHours.Practice_05_20_2021;

public class Birds {
    //emcapsulation

    private String species;
    private boolean canFly;
    private double beakLength;
    private String planet = "Earth";

    public String getSpecies() {
        return species;

    }

    public void setSpecies(String species) {
        if (species == null || species.isEmpty()) {
            return;
        }
        this.species = species;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public double getBeakLength() {
        return beakLength;
    }

    public void setBeakLength(double beakLength) {
        //  if (beakLength < 0) {
        //       return;
        //    }
        if (beakLength > 0) {
            this.beakLength = beakLength;
        } else {
            System.out.println("Invalid length");
        }
    }


}