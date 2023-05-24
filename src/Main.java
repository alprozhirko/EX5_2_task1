import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> sortedList = new ArrayList<>();

        for (int l : intList) {
            if (l > 0) {
                if (l % 2 == 0) {
                    sortedList.add(l);
                }
            }
        }
        sortedList.sort(Comparator.naturalOrder());
        System.out.println(sortedList);
    }
}