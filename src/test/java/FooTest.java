import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FooTest {

    @Test
    public void foo() {
        assertThat(
                new Foo().foo())
                .isEqualTo("foo");
    }

}