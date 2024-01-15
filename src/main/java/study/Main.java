package study;

public class Main {
    public static void main(String[] args) {

        while(true) {
            String[] answer = {"7", "1", "3"};
            BaseBallGameManager manager = new BaseBallGameManager(3, answer);

            InputView inputView = new InputView();
            String inputString = inputView.showUi();

            String[] input = inputString.split("");
            int strikeCount = manager.countStrike(input);
            int ballCount = manager.countBall(input);

            ResultView resultView = new ResultView();
            resultView.showUi(new ScoreDto(strikeCount, ballCount));

            FinishView finishView = new FinishView();
            if(manager.isFinish(strikeCount) && finishView.showUi())
                break;

        }
    }
}
