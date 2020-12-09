import java.util.ArrayList;
import java.util.List;

public class Sum {


    public  Integer SumList(List<Integer> list) {
        int sumNumber = 0;
        for (int number : list) {
            sumNumber = sumNumber + number;
        }
        return sumNumber;
    }

}