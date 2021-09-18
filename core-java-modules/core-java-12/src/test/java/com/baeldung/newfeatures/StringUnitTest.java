package java.com.surya.newfeatures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringUnitTest {

    @Test
    public void givenString_thenRevertValue() {
        String text = "surya";
        String transformed = text.transform(value -> new StringBuilder(value).reverse().toString());
        assertEquals("gnudleaB", transformed);
    }
}
