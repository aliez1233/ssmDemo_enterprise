package com.my.vo;

import java.util.Date;

public class Item {
    private Integer itemLd;
    private String  itemName;
    private String userName;
    private String itemTitle;
    private Date itemDate;
    private String itemContent;

    public Item() {
        super();
    }

    public Integer getItemLd() {
        return itemLd;
    }

    public void setItemLd(Integer itemLd) {
        this.itemLd = itemLd;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
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

    @Override
    public String toString() {
        return "Item{" +
                "itemLd=" + itemLd +
                ", itemName='" + itemName + '\'' +
                ", userName='" + userName + '\'' +
                ", itemTitle='" + itemTitle + '\'' +
                ", itemDate=" + itemDate +
                ", itemContent='" + itemContent + '\'' +
                '}';
    }
}
