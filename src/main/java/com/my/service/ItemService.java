package com.my.service;

import com.my.vo.Item;

import java.util.List;

public interface ItemService {
    List<Item> queryALLItem();
    // 查询全部Book,返回list集合
    int insertItem(Item item);
    //添加一本书
    int updateItem(Item item);
    //更新Book
    Item queryItemById(int id);
    //根据id查询，返回一本书
    int deleteItemById(int id);
}
