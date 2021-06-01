package com.gildedrose;

import java.util.Arrays;

import com.gildedrose.model.UpdatableItem;

class GildedRose {

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        Arrays.stream(items)
            .filter(item -> item instanceof UpdatableItem)
            .forEach(item -> ((UpdatableItem) item).update());
    }

}