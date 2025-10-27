package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class Application {
    public static void main(String[] args) {
//        List<String> carNames = InputView.readCarNames();
//        int tryCount = InputView.readTryCount();
//
//        System.out.println("입력 확인: " + carNames + " / " + tryCount);

        //임시 테스트
        Car car = new Car("pobi");

        for (int i = 0; i < 5; i++) {
            car.move();
            System.out.println(car.getName() + " : " + car.getPositionSymbol());
        }
    }
}
