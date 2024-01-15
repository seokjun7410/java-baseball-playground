package study;

import java.util.Scanner;

public class FinishView {
    public boolean showUi() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.print("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요");
        Scanner scanner = new Scanner(System.in);
        int command = scanner.nextInt();
        if(command == 2)
            return true;
        return false;
    }
}
