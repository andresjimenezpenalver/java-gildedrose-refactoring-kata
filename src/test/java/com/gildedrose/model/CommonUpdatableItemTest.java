package com.gildedrose.model;

import org.junit.jupiter.api.Test;

class CommonUpdatableItemTest {

    @Test
    void common() {
        commonTest(10, 25, 24);
    }

    @Test
    void commonWhenSellByDateHasPassed() {
        commonTest(0, 25, 23);
    }

    void commonTest(int sellIn, int quality, int expectedQuality) {
        final CommonItem item = new CommonItem("foo", sellIn, quality);
        item.update();
        QualityChecker.assertQualityInRightInterval(item.quality);
        QualityChecker.assertExpectedQuality(item.quality, expectedQuality);
    }

}
