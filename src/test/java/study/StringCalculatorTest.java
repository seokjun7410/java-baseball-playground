package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {

    String input;

    @BeforeEach
    void setUp() {
        input = "2 + 3 * 4 / 2";
    }

    @Test
    void calculateTest() {
        String[] split = input.split(" ");

        int result = Integer.parseInt(split[0]);

        for (int i = 1; i < split.length; i += 2) {
            String operator = split[i];
            int value = Integer.parseInt(split[i + 1]);
            result = calculate(result, operator, value);
        }

        assertThat(result).isEqualTo(10);
    }

    private int calculate(int result, String operator, int value) {
        if (operator.equals("+"))
            return result + value;
        if (operator.equals("-"))
            return result - value;
        if (operator.equals("/"))
            return result / value;
        if (operator.equals("*"))
            return result * value;

        throw new IllegalArgumentException();
    }
}
