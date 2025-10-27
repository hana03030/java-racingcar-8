package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;

public class InputView {
    public static List<String> readCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String inputNames = Console.readLine();

        //, 기준으로 split하고 trim으로 공백 제거 후 반환
        return Arrays.stream(inputNames.split(","))
                .map(name -> name.trim())
                .toList();
    }

    public static int readTryCount() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        String inputCount = Console.readLine();

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
