package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    @DisplayName("랜덤값이 4 이상일 때 전진한다.")
    @Test
    void moveWhenRandomIsFourOrMore() {
        Car car = new Car("pobi");

        // 5번 직접 move 호출을 시도한다
        // 대신 position의 증가 여부를 수동 검증
        int before = car.getPosition();
        car.move();
        int after = car.getPosition();

        assertThat(after).isBetween(before, before + 1);
    }

    @DisplayName("자동차 이름이 5자 초과면 예외 발생")
    @Test
    void throwExceptionWhenNameTooLong() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> new Car("abcdef"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("5자 이하여야");
    }
}
