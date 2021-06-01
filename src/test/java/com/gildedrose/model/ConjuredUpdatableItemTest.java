package com.gildedrose.model;

import org.junit.jupiter.api.Test;

class ConjuredUpdatableItemTest {

    @Test
    void conjured() {
        conjuredTest(15,25, 23);
    }

    @Test
    void conjuredWhenSellByDateHasPassed() {
        conjuredTest(0,25, 21);
    }

    @Test
    void conjuredWhenSellByDateHasPassedAndCloseToMinQuality() {
        conjuredTest(0,3, 0);
    }

    void conjuredTest(int sellIn, int quality, int expectedQuality) {
        final ConjuredItem item = new ConjuredItem(sellIn, quality);
        item.update();
        QualityChecker.assertQualityInRightInterval(item.quality);
        QualityChecker.assertExpectedQuality(item.quality, expectedQuality);
    }

}
