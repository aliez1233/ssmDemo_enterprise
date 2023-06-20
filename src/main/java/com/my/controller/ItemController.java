package com.my.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.my.service.EmployeeService;
import com.my.service.ItemService;
import com.my.vo.Employees;
import com.my.vo.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("/item")
@Controller
public class ItemController {
    @Autowired
    private ItemService itemService;

    /**
     * 查找所有的书
     *
     * @param pn
     * @param model
     * @return
     */
    @RequestMapping("/allItem")
    public String queryAllItem(@RequestParam(name = "pn", defaultValue = "1") Integer pn, Model model) {
        PageHelper.startPage(pn, 10);// 第pn页，每页10条记录
        List<Items> item = itemService.queryAllItem();
        // 用PageInfo对结果进行包装
        PageInfo pageInfo = new PageInfo(item);
        model.addAttribute("pageInfo", pageInfo);
        return "allItem";
    }
    /**
     * 跳转到添加图书页面
     */
    @RequestMapping("/toAddItem")
    public String toAddItem() {

        return "addItem";
    }

    /**
     * 添加一本书到数据库
     * 重定向到分页查找页面
     */
    @RequestMapping("/addItem")
    public String addItem(Items items) {
        itemService.insertItem(items);
        return "redirect:allItem";

    }
    /**
     * 跳转到修改图书页面
     */
    @RequestMapping("/toUpdateItem")
    public String toUpdateItem(Integer id,Model model) {
        Items item = itemService.queryItemById(id);
        model.addAttribute("item", item);
        return "updateItem";
    }

    /**
     * 数据库中更新图书
     * 重定向到分页查找页面
     */
    @RequestMapping("/updateItem")
    public String updateItem(Items item) {
        itemService.updateItem(item);
        return "redirect:allItem";

    }
    /**
     * 根据id删除书籍
     */
    @RequestMapping("/del/{ItemId}")
    public String delItem(@PathVariable("ItemId") Integer ItemId) {
        itemService.deleteItemById(ItemId);
        return "redirect:/item/allItem";

    }
}
