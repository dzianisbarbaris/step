package by.savik.L20_01_2025;

import by.savik.utils.ArrayUtil;

import java.util.Arrays;

public class Task02 {
    public static void main(String[] args) {
        findPhone();
    }

    private static void findPhone() {
        long[] phoneBase = ArrayUtil.generateLongArray(1000, 375298427600L, 375298427618L);
        Arrays.sort(phoneBase);
        long index = Arrays.binarySearch(phoneBase, 375298427617L);
        System.out.println(index >= 0 ? "Найден элемент по индексу " + index : "Элемент не найден");
    }
}
