package com.my.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.my.service.NoticeService;
import com.my.vo.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("/notice")
@Controller
public class NoticeController {
    @Autowired
    private NoticeService noticeService;
    /**
     * 查找所有的公告
     *
     * @param pn
     * @param model
     * @return
     */
    @RequestMapping("/allNotice")
    private String queryAllNotice(@RequestParam(name = "pn",defaultValue = "1") Integer pn, Model model) {
        PageHelper.startPage(pn, 10);
        List<Notice> notices=noticeService.queryAllNotice();
        PageInfo pageInfo=new PageInfo(notices);
        model.addAttribute("pageInfo",pageInfo);
        return "allNotice";
    }
    /**
     * 跳转到添加公告页面
     */
    @RequestMapping("/toAddNotice")
    public String toAddNotice(){
        return "addNotice";
    }
    /**
     * 添加一则公告到数据库
     * 重定向到分页查找页面
     */
    @RequestMapping("/addNotice")
    public String addNotice(Notice notice){
        noticeService.insertNotice(notice);
        return "redirect:allNotice";
    }
    /**
     * 跳转到修改公告内容页面
     */
    @RequestMapping("/toUpdateNotice")
    public String toUpdateFile(Integer id,Model model){
        Notice notice=noticeService.queryNoticeById(id);
        model.addAttribute("notice",notice);
        return "updateNotice";
    }
    /**
     * 数据库中更新公告
     * 重定向到分页查找页面
     */
    @RequestMapping("/updateNotice")
    public String updateNotice(Notice notice){
        noticeService.updateNotice(notice);
        return "redirect:allNotice";
    }
    /**
     * 根据id删除公告
     */
    @RequestMapping("/delete/{id}")
    public String deleteNotice(@PathVariable("id")Integer id){
        noticeService.deleteNoticeById(id);
        return "redirect:/notice/allNotice";
    }

}
