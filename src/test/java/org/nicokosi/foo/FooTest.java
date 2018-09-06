package org.nicokosi.foo;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FooTest {

    @Test
    public void bar() {
        assertThat(new Foo().bar()).isEqualTo("bar");
    }

}