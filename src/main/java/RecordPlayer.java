public class RecordPlayer {
    private String make;
    private String model;

    public RecordPlayer(String make, String model){
        this.make = make;
        this.model = model;
    }

    public String getMake(){
        return this.make;
    }

    public String getModel(){
        return this.model;
    }
}