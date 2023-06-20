package com.my.service;

import com.my.dao.ItemMapper;
import com.my.vo.Employees;
import com.my.vo.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService{
    @Autowired
    ItemMapper itemMapper;
    public List<Items> queryAllItem() {

        return itemMapper.queryAllItem();
    }

    public int insertItem(Items item) {
        int i= itemMapper.insertItem(item);
        return i;
    }

    public int updateItem(Items item) {
        int i=itemMapper.updateItem(item);
        return i;
    }

    public Items queryItemById(int id) {


        return itemMapper.queryItemById(id);
    }

    public int deleteItemById(int id) {
        int i= itemMapper.deleteItemById(id);
        return i;
    }
}
