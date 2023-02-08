package ru.clevertec;

import java.util.Arrays;

public class CoreUtils {
    public boolean isAllPositiveNumber(String... str) {
        return Arrays.stream(str)
                .allMatch(Utils::isPositiveNumber);
    }
    public boolean isAllNotEmpty(String... str) {
        return Arrays.stream(str)
                .allMatch(Utils::isNotEmpty);
    }
}
