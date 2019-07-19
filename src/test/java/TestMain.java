import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {

    @Test
    public void test1() {
        assertEquals(BigInteger.valueOf(80), Main.perimeter(BigInteger.valueOf(5)));
    }
    @Test
    public void test2() {
        assertEquals(BigInteger.valueOf(216), Main.perimeter(BigInteger.valueOf(7)));
    }
    @Test
    public void test3() {
        assertEquals(BigInteger.valueOf(14098308), Main.perimeter(BigInteger.valueOf(30)));
    }

}
