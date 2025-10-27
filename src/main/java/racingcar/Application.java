package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> carNames = InputView.readCarNames();

        System.out.println("시도할 횟수는 몇 회인가요?");
        String tryCountInput = Console.readLine();

        System.out.println("입력 확인: " + carNames + " / " + tryCountInput);
    }
}
