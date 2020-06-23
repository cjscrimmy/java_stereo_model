public class Device implements IConnect{
    private String type;
    public Device(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

    public String connect(Stereo stereo) {
       return "Connected to " + stereo.getName();
    }
}
