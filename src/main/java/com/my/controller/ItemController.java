package com.my.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.my.service.ItemService;
import com.my.vo.Employee;
import com.my.vo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("item")
@Controller
public class ItemController {
    /**
     * 自动注入employeeService
     * */
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
        List<Item> items = itemService.queryALLItem();
        // 用PageInfo对结果进行包装
        PageInfo pageInfo = new PageInfo(items);
        model.addAttribute("pageInfo", pageInfo);
        System.out.println(pageInfo.toString());
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
    public String addItem(Item item) {
        itemService.insertItem(item);
        return "redirect:allItem";

    }
    /**
     * 跳转到修改图书页面
     */
    @RequestMapping("/toUpdateItem")
    public String toUpdateItem(Integer id,Model model) {
        Item item = itemService.queryItemById(id);
        model.addAttribute("item", item);
        return "updateItem";
    }

    /**
     * 数据库中更新图书
     * 重定向到分页查找页面
     */
    @RequestMapping("/updateItem")
    public String updateItem(Item item) {
        itemService.updateItem(item);
        return "redirect:allItem";

    }
    /**
     * 根据id删除书籍
     */
    @RequestMapping("/del/{itemId}")
    public String delItem(@PathVariable("itemId") Integer itemId) {
       itemService.deleteItemById(itemId);
        return "redirect:/item/allItem";

    }

}
