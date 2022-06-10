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

  @Test
  void notLeapYears() {
    assertThat(LeapYear.leapYear(100)).isFalse();
    assertThat(LeapYear.leapYear(200)).isFalse();
    assertThat(LeapYear.leapYear(300)).isFalse();
    assertThat(LeapYear.leapYear(500)).isFalse();
    assertThat(LeapYear.leapYear(1700)).isFalse();
    assertThat(LeapYear.leapYear(1800)).isFalse();
    assertThat(LeapYear.leapYear(1900)).isFalse();
    assertThat(LeapYear.leapYear(2100)).isFalse();
  }

}

