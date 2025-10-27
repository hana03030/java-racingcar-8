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
}
