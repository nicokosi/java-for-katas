import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Roman {

  private Map<Integer, String> map;

  public Roman() {
    map = new TreeMap<>((k1, k2) -> k2 - k1);
    map.put(10, "X");
    map.put(5, "V");
    map.put(1, "I");
  }

  public String roman(int number) {
    for (Integer divisor : map.keySet()) {
      int factor = number / divisor;
      if (factor > 0) {
        if (number == 4) return "IV";
        final int remainder = number % divisor;
        if (remainder == 0) return map.get(divisor).repeat(factor) + roman(remainder);
        if (remainder == 1) return "V" + map.get(1);
      }
    }
    return "";
  }

}
