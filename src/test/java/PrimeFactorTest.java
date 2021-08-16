import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;

public class PrimeFactorTest {

    private List<Integer> list(int... ints) {
        List<Integer> list = new ArrayList<>();
        for (int i : ints)
            list.add(i);
        return list;
    }

    @Test
    void testFactorf1() {
        PrimeFactor primefacts = new PrimeFactor();
        assertEquals(list(),primefacts.prime(1),"Should return prime factors of given number.");
    }

    @Test
    void testFactorsof2() {
        PrimeFactor primefacts = new PrimeFactor();
        assertEquals(list(2),primefacts.prime(2),"Should return prime factors of given number.");
    }

    @Test
    void testFactorsof3() {
        PrimeFactor primefacts = new PrimeFactor();
        assertEquals(list(3),primefacts.prime(3),"Should return prime factors of given number.");
    }

    @Test
    void testFactorsof4() {
        PrimeFactor primefacts = new PrimeFactor();
        assertEquals(list(2,2),primefacts.prime(4),"Should return prime factors of given number.");
    }

    @Test
    void testFactorsof6() {
        PrimeFactor primefacts = new PrimeFactor();
        assertEquals(list(2,3),primefacts.prime(6),"Should return prime factors of given number.");
    }

    @Test
    void testFactorsof5() {
        PrimeFactor primefacts = new PrimeFactor();
        assertEquals(list(5),primefacts.prime(5),"Should return prime factors of given number.");
    }

    @Test
    void testFactorsofRandom300() {
        PrimeFactor primefacts = new PrimeFactor();
        assertEquals(list(2,2,3,5,5),primefacts.prime(300),"Should return prime factors of given number.");
    }
}
