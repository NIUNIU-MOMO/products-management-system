package com.lfy.management.pojo;

import java.util.List;

public class QueryResult {
    private int amount;  // 查询到的结果总数
    private int currentPage;  // 当前页
    private int prePage; // 上一页
    private int nextPage; // 下一页
    private int totalPage; // 总页数
    private int pageSize; // 每页显示记录条数
    private List<Object> resultSet; // 查询结果集

    public QueryResult() {
        currentPage = 1;
        pageSize = 10;
    }

    public QueryResult(int amount, int currentPage, int prePage, int nextPage, int totalPage, int pageSize, List<Object> resultSet) {
        this.amount = amount;
        this.currentPage = currentPage;
        this.prePage = prePage;
        this.nextPage = nextPage;
        this.totalPage = totalPage;
        this.pageSize = pageSize;
        this.resultSet = resultSet;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPrePage() {
        return prePage;
    }

    public void setPrePage(int prePage) {
        this.prePage = prePage;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<Object> getResultSet() {
        return resultSet;
    }

    public void setResultSet(List<Object> resultSet) {
        this.resultSet = resultSet;
    }

    @Override
    public String toString() {
        return "QueryResult{" +
                "amount=" + amount +
                ", currentPage=" + currentPage +
                ", prePage=" + prePage +
                ", nextPage=" + nextPage +
                ", totalPage=" + totalPage +
                ", pageSize=" + pageSize +
                ", resultSet=" + resultSet +
                '}';
    }
}
