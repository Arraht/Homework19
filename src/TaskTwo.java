import java.util.*;

public class TaskTwo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(10, 1, 13, 32, 40, 40, 5, 5, 6, 7));
        Set<Integer> numsSet = new HashSet<>(nums);
        nums.clear();
        nums.addAll(numsSet);
        Collections.sort(nums);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                System.out.print(nums.get(i) + ", ");
            }
        }
    }
}