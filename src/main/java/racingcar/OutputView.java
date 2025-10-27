package racingcar;

import java.util.List;

public class OutputView {
    // 이후 테스트와 유지보수를 쉽게하기 위해서
    // 모든 System.out.println 출력을 이쪽으로 이동

    public static void printExecutionResult() {
        System.out.println("\n실행 결과");
    }

    public static void printRoundResult(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getName() + " : " + car.getPositionSymbol());
        }
        System.out.println();
    }

    public static void printWinners(List<String> winners) {
        System.out.println("최종 우승자 : " + String.join(", ", winners));
    }
}
