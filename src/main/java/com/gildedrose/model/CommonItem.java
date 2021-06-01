package com.gildedrose.model;

public class CommonItem extends AbstractUpdatableItem {

    public CommonItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {
        decrementQuality();
        decrementSellIn();
        if (hasPassedSellByDate()) {
            decrementQuality();
        }
    }

}
