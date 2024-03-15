import org.junit.Test;
import static org.junit.Assert.*;

public class CheckItTest {

    //step 2
    @Test
    public void testCheckItTrue(){
        assertTrue(CheckIt.checkIt(true, true, true));
    }

    //step 2
    @Test
    public void testCheckItFalse(){
        assertFalse(CheckIt.checkIt(false, false, false));
    }

    //step 3
    @Test
    public void clauseCovTrue() {
        assertTrue(CheckIt.checkIt(true, true, true));
    }

    //step 3
    @Test
    public void clauseCovFalse() {
        assertFalse(CheckIt.checkIt(false, false, false));
    }

}
