import org.junit.Test;
import static org.junit.Assert.*;

public class CheckItTest {

    //step 2
    @Test
    public void testCheckItTrue1(){
        assertTrue(CheckIt.checkIt(true, true, true));
    }

    //step 2
    @Test
    public void testCheckItFalse1(){
        assertFalse(CheckIt.checkIt(false, false, true));
    }

    //step 3
    @Test
    public void testCheckItTrue2(){
        assertTrue(CheckIt.checkIt(true, true, true));
    }

    //step 3
    @Test
    public void testCheckItFalse2(){
        assertFalse(CheckIt.checkIt(false, false, false));
    }

}
