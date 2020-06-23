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
}
