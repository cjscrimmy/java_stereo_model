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

}
