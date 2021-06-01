package com.gildedrose.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QualityChecker {

    public static void assertQualityInRightInterval(int itemQuality) {
        assertTrue(AbstractUpdatableItem.MIN_QUALITY <= itemQuality);
        assertTrue(itemQuality <= AbstractUpdatableItem.MAX_QUALITY);
    }

    public static void assertExpectedQuality(int itemQuality, int expectedQuality) {
        assertEquals(itemQuality, expectedQuality);
    }

}