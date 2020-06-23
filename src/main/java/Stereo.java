public class Stereo{
    private String name;
    private Radio radio;
    private CDPlayer cdPlayer;
    private RecordPlayer recordPlayer;
    private int volume;

    public Stereo(String name, Radio radio, CDPlayer cdPlayer, RecordPlayer recordPlayer){
        this.name = name;
        this.radio = radio;
        this.cdPlayer = cdPlayer;
        this.recordPlayer = recordPlayer;
        this.volume = 0;
    }

    public String getName(){
        return this.name;
    }

    public Radio getRadio(){
        return this.radio;
    }

    public CDPlayer getCDPlayer(){
        return this.cdPlayer;
    }

    public RecordPlayer getRecordPlayer(){
        return this.recordPlayer;
    }

    public int getVolume(){
        return this.volume;
    }

    public void raiseVolume(){
        this.volume += 1;
    }

    public void lowerVolume(){
        if(this.volume > 0){
            this.volume -= 1;
        }
    }

    public String playCD(String cd){
        return cdPlayer.play(cd);
    }

    public String stopCD(){
        return cdPlayer.stop();
    }

    public String pauseCD(){
        return cdPlayer.pause();
    }

    public String playRecord(String record){
        return recordPlayer.play(record);
    }

    public String stopRecord(){
        return recordPlayer.stop();
    }

    public String tuneRadio(String station){
        return radio.tune(station);
    }

    public String connect(Device device) {
        return "Connected to " + device.getType();
    }
}
