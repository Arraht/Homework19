import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaskThree {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("монитор", "монитор", "клавиатура", "клавиатура", "блок"));
        Set<String> wordsSet = new HashSet<>(words);
        System.out.println(wordsSet);
    }
}