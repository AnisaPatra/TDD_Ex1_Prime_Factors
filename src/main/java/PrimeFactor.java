import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public static List<Integer> prime(int no){
        ArrayList<Integer> factors = new ArrayList<>();

        for (int i= 2; no > 1; ++i ){
            for (; no %i == 0; no /=i) {
                factors.add(i);
            }
        }

        return factors;
    }
}
