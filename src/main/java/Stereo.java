public class Stereo{
    private String name;
    private Radio radio;
    private CDPlayer cdPlayer;
    private RecordPlayer recordPlayer;

    public Stereo(String name, Radio radio, CDPlayer cdPlayer, RecordPlayer recordPlayer){
        this.name = name;
        this.radio = radio;
        this.cdPlayer = cdPlayer;
        this.recordPlayer = recordPlayer;
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
}
