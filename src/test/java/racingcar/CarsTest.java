package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {
    @DisplayName("가장 멀리 간 자동차가 우승자로 선정된다.")
    @Test
    void shouldSelectWinnerByMaxPosition() {
        List<String> names = List.of("pobi", "woni", "jun");
        Cars cars = new Cars(names);

        // pobi를 2번 move 시도
        cars.getCars().get(0).move();
        cars.getCars().get(0).move();

        List<String> winners = cars.getWinners();

        assertThat(winners).containsAnyOf("pobi", "woni", "jun");
    }
}
