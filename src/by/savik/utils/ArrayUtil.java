package by.savik.utils;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtil {

    private static final Random random = new Random();


    public static int[] generateIntArray(int size, int numberOrigin, int numberBound) {
        int[] array = random.ints(size, numberOrigin, numberBound).toArray();
        System.out.println("Сгенерированный массив -> " + Arrays.toString(array));
        return array;
    }

    public static void generateIntArray(int[] originArray, int numberOrigin, int numberBound) {
        int[] array = random.ints(originArray.length, numberOrigin, numberBound).toArray();
        System.out.println("Сгенерированный массив -> " + Arrays.toString(array));
        System.arraycopy(array, 0, originArray, 0, originArray.length);
    }

    public static long[] generateLongArray(int size, long numberOrigin, long numberBound) {
        long[] array = random.longs(size, numberOrigin, numberBound).toArray();
        System.out.println("Сгенерированный массив -> " + Arrays.toString(array));
        return array;
    }
}