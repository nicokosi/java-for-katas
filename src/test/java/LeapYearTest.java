import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class LeapYearTest {

  @Nested
  class LeapYears {
    @DisplayName("All years divisible by 400 ARE leap years")
    @ParameterizedTest
    @ValueSource(ints = {400, 800, 1200, 1600, 2000})
    void div400(int year) {
      assertThat(LeapYear.leapYear(year)).isTrue();
    }

    @DisplayName("All years divisible by 4 but not by 100 ARE leap years")
    @ParameterizedTest
    @ValueSource(ints = {4, 8, 12})
    void div4Not100(int year) {
      assertThat(LeapYear.leapYear(year)).isTrue();
    }
  }

  @Nested
  class NotLeapYears {
    @DisplayName("All years divisible by 100 but not by 400 are NOT leap years")
    @ParameterizedTest
    @ValueSource(ints = {100, 200, 300, 500})
    void div100Not400(int year) {
      assertThat(LeapYear.leapYear(year)).isFalse();
    }

    @DisplayName("All years not divisible by 4 are NOT leap years")
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 5})
    void notDiv4(int year) {
      assertThat(LeapYear.leapYear(year)).isFalse();
    }
  }

}

