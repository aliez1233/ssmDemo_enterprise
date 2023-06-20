package com.my.vo;

import java.util.Date;

public class Items {
    private Integer itemId;
    private String userName;
    private String itemTitle;
    private Date itemDate;
    private String itemContent;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public Date getItemDate() {
        return itemDate;
    }

    public void setItemDate(Date itemDate) {
        this.itemDate = itemDate;
    }

    public String getItemContent() {
        return itemContent;
    }

    public void setItemContent(String itemContent) {
        this.itemContent = itemContent;
    }

    public Items(Integer itemId, String userName, String itemTitle, Date itemDate, String itemContent) {
        this.itemId = itemId;
        this.userName = userName;
        this.itemTitle = itemTitle;
        this.itemDate = itemDate;
        this.itemContent = itemContent;
    }

    @Override
    public String toString() {
        return "Items{" +
                "itemId=" + itemId +
                ", userName='" + userName + '\'' +
                ", itemTitle='" + itemTitle + '\'' +
                ", itemDate=" + itemDate +
                ", itemContent='" + itemContent + '\'' +
                '}';
    }
}
