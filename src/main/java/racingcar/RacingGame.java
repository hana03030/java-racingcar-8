package racingcar;

import java.util.List;

public class RacingGame {
    public void start() {
        // 입력 받기
        List<String> carNames = InputView.readCarNames();
        int tryCount = InputView.readTryCount();

        // 자동차 리스트 초기화
        Cars cars = new Cars(carNames);

        // 실행 결과 안내
        OutputView.printExecutionResult();

        // 시도 횟수만큼 경주 반복
        for (int i = 0; i < tryCount; i++) {
            cars.moveAll();
            OutputView.printRoundResult(cars.getCars());
        }

        List<String> winners = cars.getWinners();
        OutputView.printWinners(winners);
    }
}
