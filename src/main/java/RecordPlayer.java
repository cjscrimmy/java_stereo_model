public class RecordPlayer extends Component{

    public RecordPlayer(String make, String model){
        super(make, model);
    }


    public String play(String record){
        return "Playing " + record;
    }

    public String stop(){
        return "Music Stopped";
    }
}
