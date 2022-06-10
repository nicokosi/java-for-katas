import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LeapYearTest {

  @Test
  void leapYears() {
    assertThat(LeapYear.leapYear(400)).isTrue();
    assertThat(LeapYear.leapYear(800)).isTrue();
    assertThat(LeapYear.leapYear(1200)).isTrue();
    assertThat(LeapYear.leapYear(1600)).isTrue();
    assertThat(LeapYear.leapYear(2000)).isTrue();
  }

}

