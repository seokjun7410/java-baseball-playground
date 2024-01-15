package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberBaseBallTest {

    private String answer;

    @BeforeEach
    void setUp() {
        answer = "789";
    }

    @ParameterizedTest
    @CsvSource(value = {"123:0:0", "127:0:1", "129:1:0","789:3:0"},delimiter = ':')
    void calculateScore(String input, int expectedStrikeCount, int expectedBallCount) {
        String[] inputSplit = input.split("");
        String[] answerSplit = answer.split("");
        BaseBallGameManager baseBallGameManager = new BaseBallGameManager(3, answerSplit);
        int strikeCount = baseBallGameManager.countStrike(inputSplit);
        int ballCount = baseBallGameManager.countBall(inputSplit);

        assertThat(strikeCount).isEqualTo(expectedStrikeCount);
        assertThat(ballCount).isEqualTo(expectedBallCount);
    }

}
