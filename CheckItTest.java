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

    //step 4 test 1
    @Test
    public void CoCTest1(){
        assertTrue(CheckIt.checkIt(true,true,true));
    }

    //step 4 test 2
    @Test
    public void CoCTest2(){
        assertTrue(CheckIt.checkIt(true,true,false));
    }

    //step 4 test 3
    @Test
    public void CoCTest3(){
        assertTrue(CheckIt.checkIt(true,false,true));
    }

    //step 4 test 4
    @Test
    public void CoCTest4(){
        assertTrue(CheckIt.checkIt(true,false,false));
    }

    //step 4 test 5
    @Test
    public void CoCTest5(){
        assertTrue(CheckIt.checkIt(false,true,true));
    }

    //step 4 test 6
    @Test
    public void CoCTest6(){
        assertFalse(CheckIt.checkIt(false,true,false));
    }

    //step 4 test 7
    @Test
    public void CoCTest7(){
        assertFalse(CheckIt.checkIt(false,false,true));
    }

    //step 4 test 8
    @Test
    public void CoCTest8(){
        assertFalse(CheckIt.checkIt(false,false,false));
    }

    //step 5 row 2
    @Test
    public void CACCTest1(){
        assertTrue(CheckIt.checkIt(true,true,false));
    }

    //step 5 row 6
    @Test
    public void CACCTest2(){
        assertFalse(CheckIt.checkIt(false,true,false));
    }

    //step 6 pair (1,5)
    @Test
    public void RACCTest1_5(){
        assertTrue(CheckIt.checkIt(true,true,true));
        assertFalse(CheckIt.checkIt(false,true,true));
    }

    //step 6 part (2,6)
    @Test
    public void RACCTest2_6(){
        assertTrue(CheckIt.checkIt(true,true,false));
        assertFalse(CheckIt.checkIt(false,true,false));
    }
    //step 6 part (3,7)
    @Test
    public void RACCTest3_7(){
        assertTrue(CheckIt.checkIt(true,false,true));
        assertFalse(CheckIt.checkIt(false,false,true));
    }



}
