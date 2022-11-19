import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class Solution {

    public int findOddElement(List<Integer> array) {
        Collections.sort(array);
        //1146699
        for (int i = 0; i < array.size(); i = i +2) {
            boolean match = false;
            int element = array.get(i);
            for (int k = i + 1; k < array.size(); k++) {
                int elementTwo = array.get(k);
                if (Objects.equals(element, elementTwo)) {
                    match = true;
                    break;
                }
            }
            if (!match) {
                return element;
            }
        } return 0;
    }

    public int findOddElementTwo(List<Integer> array) {
        Collections.sort(array);
        //1146699
        int odd = 0;
        for (int i = 0; i < array.size()-1; i=i+2) {
            int element = array.get(i);
            int elementTwo = array.get(i+1);
            if (element != elementTwo) {
                odd = element;
                break;
            }
        }
        return odd;
    }

    public int findOddElementThree(List<Integer> array) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int element : array) {
            if (!hashSet.contains(element)) {
                hashSet.add(element);
            } else {
                hashSet.remove(element);
            }
        }
        return hashSet.stream().findFirst().get();
    }

    public int findOddElementWIP(List<Integer> array) {
        Collections.sort(array);
        int odd = 0;

        for (int i = 0; i < array.size();) {
            int element = array.get(i);
            odd = odd + element;
            for (int k = i + 1; k < array.size(); k++) {
                int elementTwo = array.get(k);
                if (element == elementTwo) {
                    odd = odd - element;
                    break;
                }
            }
        }
        return odd;
    }
}


