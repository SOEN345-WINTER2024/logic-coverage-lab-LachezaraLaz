import org.junit.Test;
import static org.junit.Assert.*;

public class CheckItTest {

    @Test
    public void testCheckItTrue(){
        assertTrue(CheckIt.checkIt(true, true, true));
    }

    @Test
    public void testCheckItFalse(){
        assertFalse(CheckIt.checkIt(false, false, true));
    }

}
