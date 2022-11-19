import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(9);
        arrayList.add(9);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(1);
        arrayList.add(6);

        Solution solution = new Solution();
        System.out.println(solution.findOddElement(arrayList));
        System.out.println(solution.findOddElementTwo(arrayList));
        System.out.println(solution.findOddElementThree(arrayList));
    }
}
