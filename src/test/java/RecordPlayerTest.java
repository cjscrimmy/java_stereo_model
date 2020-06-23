import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordPlayerTest {
    private RecordPlayer player;
    private String record;

    @Before
    public void before(){
        player = new RecordPlayer("Samsung", "RP3");
        record = "Hello";
    }

    @Test
    public void hasMake(){
        assertEquals("Samsung", player.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("RP3", player.getModel());
    }

    @Test
    public void canPlayRecord(){
        assertEquals("Playing Hello", player.play(record));
    }

    @Test
    public void canStopRecord(){
        assertEquals("Music Stopped", player.stop());
    }
}
