public class CDPlayer extends Component{

    private int numberOfCDs;

    public CDPlayer(String make, String model, int numberOfCDs){
        super(make, model);
        this.numberOfCDs = numberOfCDs;
    }


    public int getNumberOfCDs(){
        return this.numberOfCDs;
    }

    public String play(String cd){
        return "Playing " + cd;
    }

    public String stop(){
        return "Music Stopped";
    }

    public String pause(){
        return "Music Paused";
    }


}
