package day55_abstraction.exercize_example;

public  class Running extends Exersize {
    @Override
    public void perform() {
        System.out.println("Performing running exercise");

    }

    /**
     *
     * @param minutes - how long is exersize is performed
     * @return we are assuming avg num of calories while running is 13
     */

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 13;
    }
}
