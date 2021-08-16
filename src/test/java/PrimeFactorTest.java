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
        assertEquals(3,primefacts.prime(3),"Should return prime factors of given number.");
    }

    @Test
    void testFactorsof4() {
        PrimeFactor primefacts = new PrimeFactor();
        assertEquals(list(2,2),primefacts.prime(4),"Should return prime factors of given number.");
    }
}
