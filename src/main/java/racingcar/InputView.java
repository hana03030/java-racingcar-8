package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;

public class InputView {
    public static List<String> readCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String inputNames = Console.readLine();

        List<String> carNames = parseCarNames(inputNames);
        validateCarNames(carNames);
        return carNames;
    }

    private static List<String> parseCarNames(String inputNames) {
        return Arrays.stream(inputNames.split(","))
                .map(name -> name.trim())
                .toList();
    }

    private static void validateCarNames(List<String> carNames) {
        if (carNames.isEmpty()) {
            throw new IllegalArgumentException("자동차 이름을 한 개 이상 입력해야 합니다.");
        }
        for (String carName : carNames) {
            if (carName.isBlank()) {
                throw new IllegalArgumentException("자동차 이름에 공백만 있을 수 없습니다.");
            }
            if (carName.length() > 5) {
                throw new IllegalArgumentException("자동차 이름은 5자 이하여야 합니다.");
            }
        }
    }

    public static int readTryCount() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        String inputCount = Console.readLine();
        return parseTryCount(inputCount);
    }

    private static int parseTryCount(String inputCount) {
        try {
            int count = Integer.parseInt(inputCount);
            if (count <= 0) {
                throw new IllegalArgumentException("시도 횟수는 1 이상의 숫자여야 합니다.");
            }
            return count;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도 횟수는 숫자여야 합니다.");
        }
    }
}
