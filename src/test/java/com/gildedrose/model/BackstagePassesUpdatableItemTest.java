package com.gildedrose.model;

import org.junit.jupiter.api.Test;

class BackstagePassesUpdatableItemTest {

    @Test
    void backstagePassesWhenThereAreMoreThan10Days() {
        backstagePassesTest(15, 25, 26);
    }

    @Test
    void backstagePassesWhenThereAre10DaysOrLess() {
        backstagePassesTest(10, 25, 27);
    }

    @Test
    void backstagePassesWhenThereAre5DaysOrLess() {
        backstagePassesTest(5, 25, 28);
    }

    @Test
    void backstagePassesWhenSellByDateHasPassed() {
        backstagePassesTest(0, 25, 0);
    }

    void backstagePassesTest(int sellIn, int quality, int expectedQuality) {
        final BackstagePassesItem item = new BackstagePassesItem(sellIn, quality);
        item.update();
        QualityChecker.assertQualityInRightInterval(item.quality);
        QualityChecker.assertExpectedQuality(item.quality, expectedQuality);
    }

}
