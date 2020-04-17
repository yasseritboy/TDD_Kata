package WordWrap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Disabled
class WordWrapperTest {

    private WordWrapper w;


    @BeforeEach
    void setUp() {
        w = new WordWrapper();
    }


    @Test
    public void WordWrapEmptyString() {
        String result = w.wrap("", 1);
        assertEquals("", result);
    }


    @Test
    public void WordWrapNull() {
        String result = w.wrap(null, 1);
        assertEquals("", result);
    }


    @Test
    public void WordWrapSingleChar() {
        String result = w.wrap("x", 1);
        assertEquals("x", result);
    }


    @Test
    public void WordWrapTwoChar() {
        String result = w.wrap("x x", 1);
        assertEquals("x\nx", result);
    }


    @Test
    public void WordWrapThreeChar() {
        String result = w.wrap("x xx", 1);
        assertEquals("x\nxx", result);
    }


    @Test
    public void WordWrapThreeNoSpaceChar() {
        String result = w.wrap("xxx", 2);
        assertEquals("xx\nx", result);
    }

}