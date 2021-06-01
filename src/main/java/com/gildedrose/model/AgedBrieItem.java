package com.gildedrose.model;

public class AgedBrieItem extends AbstractUpdatableItem {

    public static final String AGED_BRIE = "Aged Brie";

    public AgedBrieItem(int sellIn, int quality) {
        super(AGED_BRIE, sellIn, quality);
    }

    @Override
    public void update() {
        incrementQuality();
        decrementSellIn();
        if (hasPassedSellByDate()) {
            incrementQuality();
        }
    }

}
