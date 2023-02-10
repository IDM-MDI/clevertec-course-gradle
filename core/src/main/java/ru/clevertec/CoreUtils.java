package ru.clevertec;

import java.util.Arrays;

public class CoreUtils {
    public static boolean isAllPositiveNumber(String... str) {
        return Arrays.stream(str)
                .allMatch(Utils::isPositiveNumber);
    }
    public static boolean isAllNotEmpty(String... str) {
        return Arrays.stream(str)
                .allMatch(Utils::isNotEmpty);
    }
}
