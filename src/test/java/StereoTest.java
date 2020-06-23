import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {
    private Radio radio;
    private CDPlayer cdPlayer;
    private RecordPlayer recordPlayer;
    private Stereo stereo;

    @Before
    public void before(){
        radio = new Radio("Sony", "Radio");
        cdPlayer = new CDPlayer("Sony", "SE1", 5);
        recordPlayer = new RecordPlayer("Sony", "SE45");
        stereo = new Stereo("Sony Sound System", radio, cdPlayer, recordPlayer);
    }

    @Test
    public void canGetStereoName(){
        assertEquals("Sony Sound System", stereo.getName());
    }

    @Test
    public void hasRadio(){
        assertEquals(radio, stereo.getRadio());
    }

    @Test
    public void hasCDPlayer(){
        assertEquals(cdPlayer, stereo.getCDPlayer());
    }

    @Test
    public void hasRecordPlayer(){
        assertEquals(recordPlayer, stereo.getRecordPlayer());
    }

    @Test
    public void volumeStartsAtZero(){
        assertEquals(0, stereo.getVolume());
    }

    @Test
    public void canRaiseVolume(){
        stereo.raiseVolume();
        assertEquals(1, stereo.getVolume());
    }

    @Test
    public void canLowerVolume(){
        stereo.raiseVolume();
        stereo.raiseVolume();
        stereo.lowerVolume();
        assertEquals(1, stereo.getVolume());
    }

    @Test
    public void cantHaveNegativeVolume(){
        stereo.lowerVolume();
        stereo.lowerVolume();
        assertEquals(0, stereo.getVolume());
    }

    @Test
    public void canPlayCD(){
        assertEquals("Playing OK Computer", stereo.playCD("OK Computer"));
    }

    @Test
    public void canStopCD(){
        assertEquals("Music Stopped", stereo.stopCD());
    }

    @Test
    public void canPauseCD(){
        assertEquals("Music Paused", stereo.pauseCD());
    }

    @Test
    public void canPlayRecord(){
        assertEquals("Playing White Album", stereo.playRecord("White Album"));
    }

    @Test
    public void canStopRecord(){
        assertEquals("Music Stopped", stereo.stopRecord());
    }

    @Test
    public void canTuneRadio(){
        assertEquals("Radio 2", stereo.tuneRadio("Radio 2"));
    }

    @Test
    public void canConnectToStereo(){
        Device device = new Device("mp3 player");
        assertEquals("Connected to mp3 player", stereo.connect(device));
    }

    @Test
    public void canConnectDevice(){
        Device device = new Device("mp3 player");
        assertEquals("Connected to Sony Sound System", device.connect(stereo));
    }

}
