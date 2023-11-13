package hexlet.code;

import org.apache.commons.rng.simple.RandomSource;

public class Utils {
    public static int getRandomNumberBetween(int min, int max) {
        var randomNumberGenerator = RandomSource.JDK.create();
        return randomNumberGenerator.nextInt(min, max);
    }
}
