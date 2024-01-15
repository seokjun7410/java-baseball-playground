package study;

public class BaseBallGameManager {
    private int numberSize;
    private String[] answer;

    public BaseBallGameManager(int numberSize, String[] answer) {
        this.numberSize = numberSize;
        this.answer = answer;
    }

    public int countStrike(String[] input) {
        int count = 0;
        for (int offest = 0; offest < this.numberSize; offest++) {
            count += isStrike(input, offest);
        }
        return count;
    }

    public int countBall(String[] input) {
        int count = 0;
        for (int offset = 0; offset < this.numberSize; offset++) {
            count += isBall(input, offset);
        }
        return count;
    }

    private int isStrike(String[] input, int offset) {
        if (this.answer[offset].equals(input[offset]))
            return 1;
        return 0;
    }

    private int isBall(String[] input, int offset) {
        for (int i = 0; i < offset; i++) {
            if (answer[i].equals(input[offset])) return 1;
        }

        for (int i = offset + 1; i < this.numberSize; i++) {
            if (answer[i].equals(input[offset])) return 1;
        }

        return 0;
    }
}
