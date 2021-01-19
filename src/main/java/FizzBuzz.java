class FizzBuzz {

  public static String evaluate(int number) {
    if (number % 15 == 0) {
      return "FizzBuzz";
    }
    if (number % 3 == 0) {
      return "Fizz";
    }
    if (number % 5 == 0) {
      return "Buzz";
    }
    return String.valueOf(number);
  }

  public static void main(String[] args) {
    for (int number  = 1 ; number < 100; number++) {
      System.out.println(number);
    }
  }
}
