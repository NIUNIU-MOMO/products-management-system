package com.lfy.management.pojo;

public class ImportResult {
    private String result;
    private int items;

    public ImportResult() {
    }

    public ImportResult(String result, int items) {
        this.result = result;
        this.items = items;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getItems() {
        return items;
    }

    public void setItems(int items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "ImportResult{" +
                "result='" + result + '\'' +
                ", items=" + items +
                '}';
    }
}
