import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LeapYearTest {

  @Nested
  class LeapYears {
    @DisplayName("All years divisible by 400 ARE leap years")
    @Test
    void div400() {
      assertThat(LeapYear.leapYear(400)).isTrue();
      assertThat(LeapYear.leapYear(800)).isTrue();
      assertThat(LeapYear.leapYear(1200)).isTrue();
      assertThat(LeapYear.leapYear(1600)).isTrue();
      assertThat(LeapYear.leapYear(2000)).isTrue();
    }

    @DisplayName("All years divisible by 4 but not by 100 ARE leap years")
    @Test
    void div4Not100() {
      assertThat(LeapYear.leapYear(4)).isTrue();
      assertThat(LeapYear.leapYear(8)).isTrue();
      assertThat(LeapYear.leapYear(12)).isTrue();
    }
  }

  @Nested
  class NotLeapYears {
    @DisplayName("All years divisible by 100 but not by 400 are NOT leap years")
    @Test
    void div100Not400() {
      assertThat(LeapYear.leapYear(100)).isFalse();
      assertThat(LeapYear.leapYear(200)).isFalse();
      assertThat(LeapYear.leapYear(300)).isFalse();
      assertThat(LeapYear.leapYear(500)).isFalse();
    }

    @DisplayName("All years not divisible by 4 are NOT leap years")
    @Test
    void notDiv4() {
      assertThat(LeapYear.leapYear(1)).isFalse();
      assertThat(LeapYear.leapYear(2)).isFalse();
      assertThat(LeapYear.leapYear(3)).isFalse();
      assertThat(LeapYear.leapYear(5)).isFalse();
    }
  }

}

