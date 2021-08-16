import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public static List<Integer> prime(int no){
        ArrayList<Integer> primefactors = new ArrayList<>();

        if (no == 1){
            primefactors.add(1);
        }
        if(no == 2){
            primefactors.add(2);
        }
        if(no == 3){
            primefactors.add(3);
        }

        if(no==4){
            if(no%2==0){
                primefactors.add(2,no/2);
            }
        }

        return primefactors;
    }
}
