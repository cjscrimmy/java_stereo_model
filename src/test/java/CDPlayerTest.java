import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {
    private CDPlayer player;
    private String cd;

    @Before
    public void before(){
        player = new CDPlayer("Sony", "SE5", 4);
        cd = "Abba Gold";
    }

    @Test
    public void hasModel(){
        assertEquals("SE5", player.getModel());
    }

    @Test
    public void hasMake(){
        assertEquals("Sony", player.getMake());
    }

    @Test
    public void hasNumberOfCDs(){
        assertEquals(4, player.getNumberOfCDs());
    }

    @Test
    public void canPlayCD(){
        assertEquals("Playing Abba Gold", player.play(cd));
    }

    @Test
    public void canStopCD(){
        assertEquals("Music Stopped", player.stop());
    }

    @Test
    public void canPauseCD(){
        assertEquals("Music Paused", player.pause());
    }
}
