public class Roman {
  public String roman(int number) {
    if (number == 4) {
      return "IV";
    }
    return "I".repeat(number);
  }
}
