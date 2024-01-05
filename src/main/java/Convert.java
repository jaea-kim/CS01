import java.util.ArrayList;
import java.util.List;

public class Convert {
    public static Boolean[] dec2bin(int target) {
        List<Boolean> bin = new ArrayList<>();
        while (target != 0) {
            int remainder = target % 2;
            bin.add(int2bool(remainder));
            target = target / 2;
        }
        return bin.toArray(new Boolean[bin.size()]);
    }

    public static int bin2dec(Boolean[] target) {
        int result = 0;
        int exponent = 0;
        for (Boolean b : target) {
            result = result + (int) Math.pow(2, exponent) * bool2int(b);
            exponent++;
        }
        return result;
    }

    public static Boolean int2bool(int target) {
        return target != 0;
    }

    public static int bool2int(Boolean target) {
        return target ? 1 : 0;
    }
}
