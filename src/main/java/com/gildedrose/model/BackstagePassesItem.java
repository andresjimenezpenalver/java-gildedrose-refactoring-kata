package com.gildedrose.model;

public class BackstagePassesItem extends AbstractUpdatableItem {

    public static final String BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";

    public BackstagePassesItem(int sellIn, int quality) {
        super(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, sellIn, quality);
    }

    @Override
    public void update() {
        incrementQuality();
        if (sellIn < 11) {
            incrementQuality();
        }
        if (sellIn < 6) {
            incrementQuality();
        }
        decrementSellIn();
        if (hasPassedSellByDate()) {
            dropQuality();
        }
    }

}
