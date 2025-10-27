package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> carNames = InputView.readCarNames();
        int tryCount = InputView.readTryCount();

        //임시 테스트
        Cars cars = new Cars(carNames);

        for (int i = 0; i < tryCount; i++) {
            cars.moveAll();
            cars.printStatus();
        }
    }
}
