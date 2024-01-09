import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class New {
  public static void main(String[] args) {
    String[] array = {"a", "b", "c"};
    List<String> list = Arrays.asList(array);
    Set<String> set = new HashSet<>(list);
    System.out.println(set);  // Outputs "[a, b, c]"
  }
}