package com.itmo.stuct;

/**
 * Created by xmitya on 20.03.17.
 */
class Item {
    public String value;
    Item next;

    public Item(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
