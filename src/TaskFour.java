import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskFour {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        HashMap<String, Integer> amount = new HashMap<>();
        for (int i = 0; i < strings.size(); i++) {
            String words = strings.get(i);
            if (!amount.containsKey(words)) {
                amount.put(words, 1);
            } else {
                amount.put(words, (amount.get(words) + 1));
            }
        }
        for (Map.Entry<String, Integer> entry : amount.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}