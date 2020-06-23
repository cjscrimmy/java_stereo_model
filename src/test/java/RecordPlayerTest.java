import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordPlayerTest {
    private RecordPlayer player;

    @Before
    public void before(){
        player = new RecordPlayer("Samsung", "RP3");
    }

    @Test
    public void hasMake(){
        assertEquals("Samsung", player.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("RP3", player.getModel());
    }
}
