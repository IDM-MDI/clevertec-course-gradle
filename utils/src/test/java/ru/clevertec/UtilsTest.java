/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ru.clevertec;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UtilsTest {
    @Test
    void isPositiveNumberShouldBeTrue() {
        Assertions.assertTrue(Utils.isPositiveNumber("1"));
    }
    @Test
    void isPositiveNumberShouldBeFalse() {
        Assertions.assertFalse(Utils.isPositiveNumber("-1"));
    }
    @Test
    void isPositiveNumberShouldBeFalseByException() {
        Assertions.assertFalse(Utils.isPositiveNumber(null));
    }
    @Test
    void isNotEmptyShouldBeTrue() {
        Assertions.assertTrue(Utils.isNotEmpty("test"));
    }
    @Test
    void isNotEmptyShouldBeFalse() {
        Assertions.assertFalse(Utils.isNotEmpty(""));
    }

    @Test
    void isNotEmptyShouldBeFalseByNull() {
        Assertions.assertFalse(Utils.isNotEmpty(null));
    }
}