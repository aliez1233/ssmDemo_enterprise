package com.my.service;

import com.my.dao.ItemDao;
import com.my.vo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemImpl implements ItemService{
    @Autowired
    ItemDao itemDao;
    @Override
    public List<Item> queryALLItem() {

        return itemDao.queryALLItem();
    }

    @Override
    public int insertItem(Item item) {
        int i=itemDao.insertItem(item);
        return i;
    }

    @Override
    public int updateItem(Item item) {
        int i=itemDao.updateItem(item);
        return i;
    }

    @Override
    public Item queryItemById(int id) {

        return itemDao.queryItemById(id);
    }

    @Override
    public int deleteItemById(int id) {
        int i=itemDao.deleteItemById(id);
        return i;
    }
}
