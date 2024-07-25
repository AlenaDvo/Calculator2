package org.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MainTest {

    @Test
    void addingNegative() {
        assertThat(Main.add(0F, -2F)).isEqualTo(-2F);
    }

    @Test
    void addingZero() {
        assertThat(Main.add(0F, 4F)).isEqualTo(4F);
    }

    @Test
    void addingPositive() {
        assertThat(Main.add(100F, 4F)).isEqualTo(104F);
    }

    @Test
    void subtractingNegative() {
        assertThat(Main.subtract(0F, -2F)).isEqualTo(2F);
    }

    @Test
    void subtractingZero() {
        assertThat(Main.subtract(4F, 0F)).isEqualTo(4F);
    }

    @Test
    void subtractingPositive() {
        assertThat(Main.subtract(100F, 4F)).isEqualTo(96F);
    }

    @Test
    void multiplyingNegative() {
        assertThat(Main.multiply(-1F, 4F)).isEqualTo(-4F);
    }

    @Test
    void multiplyingZero() {
        assertThat(Main.multiply(0F, -2F)).isEqualTo(0F);
    }

    @Test
    void multiplyingPositive() {
        assertThat(Main.multiply(100F, 4F)).isEqualTo(400F);
    }

    @Test
    void dividingNegative() {
        assertThat(Main.divide(2F, -2F)).isEqualTo(-1F);
    }

    @Test
    void dividingZero() {
        assertThat(Main.divide(100F, 0F)).isEqualTo("Cannot divide by zero.");
    }
    @Test
    void dividingPositive() {
        assertThat(Main.divide(100F, 4F)).isEqualTo(25F);
    }
}