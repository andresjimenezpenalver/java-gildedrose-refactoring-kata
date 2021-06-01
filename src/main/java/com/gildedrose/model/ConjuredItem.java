package com.gildedrose.model;

public class ConjuredItem extends AbstractUpdatableItem {

    public static final String CONJURED_MANA_CAKE = "Conjured Mana Cake";

    public ConjuredItem(int sellIn, int quality) {
        super(CONJURED_MANA_CAKE, sellIn, quality);
    }

    @Override
    public void update() {
        decrementQuality();
        decrementQuality();
        decrementSellIn();
        if (hasPassedSellByDate()) {
            decrementQuality();
            decrementQuality();
        }
    }

}
