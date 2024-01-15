package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String str = "1,2";
        String[] split = str.split(",");
        assertThat(split[0]).isEqualTo("1");
        assertThat(split[1]).isEqualTo("2");
    }

    @Test
    void substring() {
        String str = "(1,2)";
        String substring = str.substring(1, 4);
        assertThat(substring).isEqualTo("1,2");
    }

    @Test
    void charAt() {
        String str = "abc";

        assertThatThrownBy(() -> {
            str.charAt(3);
        }).isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: 3");
    }

}
