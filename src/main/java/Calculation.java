import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculation {
    public static Boolean[] sumBinary(Boolean[] a, Boolean[] b) {
        List<Boolean> result = new ArrayList<>();

        int sizeA = a.length;
        int sizeB = b.length;
        if (sizeA > sizeB) {
            setFalse(b, sizeB, sizeA);
        } else if (sizeB > sizeA) {
            setFalse(a, sizeA, sizeB);
        }

        int risingNumber = 0;
        for (int i = 0; i < sizeA; i++) {
            int aInt = Convert.bool2int(a[i]);
            int bInt = Convert.bool2int(b[i]);
            if (risingNumber == 0) {
                result.add(Convert.int2bool(xor(aInt, bInt)));
                risingNumber = and(aInt, bInt);
            } else {
                int xor = xor(aInt, bInt);
                result.add(Convert.int2bool(xor(risingNumber, xor)));
                risingNumber = and(xor, risingNumber);
            }
        }
        if (risingNumber == 1) {
            result.add(true);
        }

        return result.toArray(new Boolean[result.size()]);
    }

    private static int xor(int a, int b) {
        return a ^ b;
    }

    private static int and(int a, int b) {
        return a & b;
    }

    private static Boolean[] setFalse(Boolean[] target, int startSize, int endSiz) {
        target = Arrays.copyOf(target, endSiz);
        Arrays.fill(target, startSize, endSiz, false);
        return target;
    }
}
