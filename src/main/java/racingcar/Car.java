package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    public static final int MOVE_ADVANCE_THRESHOLD = 4;

    private final String name;
    private int position = 0;

    public Car(String name) {
        validateName(name);
        this.name = name;
    }

    private void validateName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("자동차 이름은 비어 있을 수 없습니다.");
        }
        if (name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하여야 합니다.");
        }
    }

    public void move() {
        int randomNumber = Randoms.pickNumberInRange(0, 9);
        if (randomNumber >= MOVE_ADVANCE_THRESHOLD) {
            position++;
        }
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public String getPositionSymbol() {
        return "-".repeat(position);
    }
}
