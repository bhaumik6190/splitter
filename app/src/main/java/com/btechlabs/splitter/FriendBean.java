package com.btechlabs.splitter;

/**
 * Created by Bhaumik on 02-07-2017.
 */

public class FriendBean {
    private String name;
    private int amount;
    private int thumbnail;

    public FriendBean() {
    }

    public FriendBean(String name, int amount, int thumbnail) {
        this.name = name;
        this.amount = amount;
        this.thumbnail = thumbnail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
