package racingcar;

import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    private final List<Car> cars;

    public Cars(List<String> names) {
        if (names == null || names.isEmpty()) {
            throw new IllegalArgumentException("자동차 이름은 한 개 이상 입력해야 합니다.");
        }

        this.cars = names.stream()
                .map(name -> new Car(name))
                .collect(Collectors.toList());
    }

    public void moveAll() {
        for (Car car : cars) {
            car.move();
        }
    }

    public List<Car> getCars() {
        return cars;
    }

    public void printStatus() {
        for (Car car : cars) {
            System.out.println(car.getName() + " : " + car.getPositionSymbol());
        }
        System.out.println();
    }
}
