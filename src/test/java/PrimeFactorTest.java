import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeFactorTest {
    @Test
    void testFactorf1() {
        PrimeFactor primefacts = new PrimeFactor();
        assertEquals(1,primefacts.prime(1),"Should return prime factors of given number.");
    }

    @Test
    void testFactorsof2() {
        PrimeFactor primefacts = new PrimeFactor();
        assertEquals(2,primefacts.prime(2),"Should return prime factors of given number.");
    }

    @Test
    void testFactorsof3() {
        PrimeFactor primefacts = new PrimeFactor();
        assertEquals(3,primefacts.prime(2),"Should return prime factors of given number.");
    }
}
