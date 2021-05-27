package OfficeHours.Practice_05_17_2021;

public class AnimalSpecies {
    String name;
    int popilation;
    int grouthRate;

    public void setInfo(String n, int p, int g){
    name = n;
    popilation = p;
    grouthRate = g;
    }
    public String getName (){
        if(name == null) {
            return "No name defined";
        }
            return name;
        }
    public int getPopilation(){
        return popilation;
    }
    public int getGrouthRate(){
       return grouthRate;
    }

    @Override
    public String toString() {
        return "AnimalSpecies{" +
                "name='" + name + '\'' +
                ", popilation=" + popilation + " million"+
                ", grouthRate=" + grouthRate +" %"+
                '}';
    }
}


