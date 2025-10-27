# 🚗 자동차 경주 (RacingCar)

## 구현 목표
주어진 횟수 동안 n대의 자동차가 전진 또는 멈추는 간단한 자동차 경주 게임을 구현한다.  
게임이 종료되면 **최종 우승자(들)** 을 출력한다.

---

## 구현할 기능 목록
### 1. 입력 기능
- 경주할 자동차 이름을 입력받는다. (쉼표 `,` 기준)
- 자동차 이름이 5자 이하인지 검증한다.
- 시도할 횟수를 입력받는다.
- 입력값이 비어있거나 유효하지 않은 경우 `IllegalArgumentException` 발생 후 종료한다.

### 2. 자동차 생성 및 초기화
- 입력받은 이름을 기반으로 자동차 (`Car`) 객체 리스트를 생성한다.
- 각 자동차의 초기 위치를 0으로 설정한다.

### 3. 전진 로직
- 0~9 범위의 랜덤 숫자를 생성한다.
- 랜덤 숫자가 4 이상이면 자동차는 전진한다.
- 전진 시 자동차의 위치를 1 증가시킨다.

### 4. 경주 진행
- 주어진 시도 횟수만큼 모든 자동차에 대해 전진 로직을 수행한다.

### 5. 우승자 판별
- 모든 자동차 중 최댓값(가장 멀리 간 거리)을 구한다.
- 최댓값을 가진 자동차(들)의 이름을 추출한다.
- 우승자가 여러 명일 경우 쉼표(`,`)로 구분하여 출력한다.

### 6. 출력
- 매 시도 결과를 출력한다.
- 최종 우승자를 다음 형식으로 출력한다.  
`최종 우승자 : pobi, jun`

---

## 예외 처리
- 자동차 이름이 5자 초과인 경우 예외 발생
- 시도 횟수가 숫자가 아닌 경우 예외 발생
- 입력값이 비어있거나 공백일 경우 예외 발생

---

## 커밋 단위 계획
| 단계 | 커밋 메시지 예시 |
|------|------------------|
| 1 | feat(racingcar): add main entry point and input prompts |
| 2 | feat(racingcar): implement car name input feature |
| 3 | feat(racingcar): implement try count input feature |
| 4 | feat(racingcar): add Car class with movement logic |
| 5 | feat(racingcar): add Cars class for managing multiple cars |
| 6 | feat(racingcar): implement RacingGame to control race flow |
| 7 | feat(racingcar): add OutputView for printing results |
| 8 | feat(racingcar): add winner determination logic |
| 9 | refactor(racingcar): improve input validation and method separation |
| 10 | test(racingcar): add tests for car movement and winner calculation |
