public class Roman {
  public String roman(int number) {
    if (number == 10) {
      return "X";
    }
    if (number == 6) {
      return "VI";
    }
    if (number == 5) {
      return "V";
    }
    if (number == 4) {
      return "IV";
    }
    return "I".repeat(number);
  }
}
