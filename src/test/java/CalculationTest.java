import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationTest {

    @Test
    void sumBinary() {
        Boolean[] a = {false, true, false, true};
        Boolean[] b = {true, true, true, false};

        Boolean[] result = Calculation.sumBinary(a, b);
        Boolean[] answer = {true, false, false, false, true};

        Assertions.assertArrayEquals(answer, result);
    }
}
