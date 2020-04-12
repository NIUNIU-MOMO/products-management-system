package com.lfy.management.pojo;

public class SaveORClearResult {
    private int savedItems;
    private int unsavedItems;

    @Override
    public String toString() {
        return "SaveORClearResult{" +
                "savedItems=" + savedItems +
                ", unsavedItems=" + unsavedItems +
                '}';
    }

    public SaveORClearResult() {
    }

    public SaveORClearResult(int savedItems, int unsavedItems) {
        this.savedItems = savedItems;
        this.unsavedItems = unsavedItems;
    }

    public int getSavedItems() {
        return savedItems;
    }

    public void setSavedItems(int savedItems) {
        this.savedItems = savedItems;
    }

    public int getUnsavedItems() {
        return unsavedItems;
    }

    public void setUnsavedItems(int unsavedItems) {
        this.unsavedItems = unsavedItems;
    }
}
