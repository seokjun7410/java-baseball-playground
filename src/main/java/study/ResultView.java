package study;

public class ResultView {
    public void showUi(ScoreDto scoreDto) {
        int strikeCount = scoreDto.getStrikeCount();
        int ballCount = scoreDto.getBallCount();

        StringBuilder stringBuilder = new StringBuilder();

        if (ballCount != 0)
            stringBuilder
                    .append(ballCount).append("볼 ");

        if (strikeCount != 0)
            stringBuilder
                    .append(strikeCount).append("스트라이크");


        System.out.print(stringBuilder);
    }
}
