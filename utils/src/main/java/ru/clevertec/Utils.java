/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ru.clevertec;

import org.apache.commons.lang3.StringUtils;

public class Utils {
    public static boolean isNotEmpty(String str) {
        return StringUtils.isNotEmpty(str);
    }
    public static boolean isPositiveNumber(String number) {
        return parseStringToInt(number) > 0;
    }

    private static int parseStringToInt(String number) {
        try {
            return Integer.parseInt(number);
        } catch (Exception e) {
            return 0;
        }
    }
}
