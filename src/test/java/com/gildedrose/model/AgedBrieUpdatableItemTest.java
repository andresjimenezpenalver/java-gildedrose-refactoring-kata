package com.gildedrose.model;

import org.junit.jupiter.api.Test;

class AgedBrieUpdatableItemTest {

    @Test
    void agedBrie() {
        agedBrieTest(10, 25, 26);
    }

    @Test
    void agedBrieWhenSellByDateHasPassed() {
        agedBrieTest(0, 25, 27);
    }

    @Test
    void agedBrieWhenSellByDateHasPassedAndMaxQuality() {
        agedBrieTest(0, 49, 50);
    }

    private void agedBrieTest(int sellIn, int quality, int expectedQuality) {
        final AgedBrieItem item = new AgedBrieItem(sellIn, quality);
        item.update();
        QualityChecker.assertQualityInRightInterval(item.quality);
        QualityChecker.assertExpectedQuality(item.quality, expectedQuality);
    }

}
