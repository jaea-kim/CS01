import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertTest {

    @Test
    @DisplayName("정수 12를 2진수로 변환하면 1100이 되어야한다.")
    void dec2bin() {
        int number = 12;
        Boolean[] answer = {false, false, true, true};
        Boolean[] result = Convert.dec2bin(number);

        Assertions.assertArrayEquals(answer, result);
    }

    @Test
    @DisplayName("2진수 1100은 정수 12가 되어야한다.")
    void bin2dec() {
        Boolean[] number = {false, false, true, true};
        int result = Convert.bin2dec(number);

        Assertions.assertEquals(result, 12);
    }
}
