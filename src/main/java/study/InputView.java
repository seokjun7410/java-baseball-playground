package study;

import java.util.Scanner;

public class InputView {

    public String showUi(){
        System.out.print("숫자를 입력해 주세요 : ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
