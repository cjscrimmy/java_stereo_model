public class CDPlayer {
    private String make;
    private String model;
    private int numberOfCDs;

    public CDPlayer(String make, String model, int numberOfCDs){
        this.make = make;
        this.model = model;
        this.numberOfCDs = numberOfCDs;
    }

    public String getModel(){
        return this.model;
    }

    public String getMake(){
        return this.make;
    }

    public int getNumberOfCDs(){
        return this.numberOfCDs;
    }


}
