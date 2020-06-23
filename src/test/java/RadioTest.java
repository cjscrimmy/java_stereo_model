import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before(){
        radio = new Radio("Philips", "PH34");
    }

    @Test
    public void canTuneRadio(){
        assertEquals("Radio 1", radio.tune("Radio 1"));
    }

    @Test
    public void canGetMake(){
        assertEquals("Philips", radio.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("PH34", radio.getModel());
    }
}
