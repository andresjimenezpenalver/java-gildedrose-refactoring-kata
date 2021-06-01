package com.gildedrose.model;

import com.gildedrose.Item;

public abstract class AbstractUpdatableItem extends Item implements UpdatableItem {

    public static final int MIN_QUALITY = 0;
    public static final int MAX_QUALITY = 50;

    protected AbstractUpdatableItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    protected void decrementSellIn() {
        sellIn = sellIn - 1;
    }

    protected void dropQuality() {
        quality = 0;
    }

    protected void decrementQuality() {
        if (MIN_QUALITY < quality) {
            quality = quality - 1;
        }
    }

    protected void incrementQuality() {
        if (quality < MAX_QUALITY) {
            quality = quality + 1;
        }
    }

    protected boolean hasPassedSellByDate() {
        return sellIn < 0;
    }

}
