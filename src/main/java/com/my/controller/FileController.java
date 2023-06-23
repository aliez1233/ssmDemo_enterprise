package com.my.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.my.service.FileService;
import com.my.vo.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("/file")
@Controller
public class FileController {
    @Autowired
    private FileService fileService;
    /**
     * 查找所有的文件
     *
     * @param pn
     * @param model
     * @return
     */
    @RequestMapping("/allFile")
    public String queryAllFile(@RequestParam(name = "pn",defaultValue = "1") Integer pn, Model model) {
        PageHelper.startPage(pn, 10);
        List<File> files=fileService.queryAllFile();
        PageInfo pageInfo= new PageInfo(files);
        model.addAttribute("pageInfo",pageInfo);
        return "allFile";
    }
    /**
     * 跳转到添加文件页面
     */
    @RequestMapping("/toAddFile")
    public String toAddFile(){

        return "addFile";
    }
    /**
     * 添加一份文件到数据库
     * 重定向到分页查找页面
     */
    @RequestMapping("/addFile")
    public String addFile(File file){
        fileService.insertFile(file);
        return "redirect:allFile";
    }
    /**
     * 跳转到修改文件内容页面
     */
    @RequestMapping("/toUpdateFile")
    public String toUpdateFile(Integer id,Model model){
        File file=fileService.queryFileById(id);
        model.addAttribute("file",file);
        return "updateFile";
    }
    /**
     * 数据库中更新文件
     * 重定向到分页查找页面
     */
    @RequestMapping("/updateFile")
    public String updateFile(File file){
        fileService.updateFile(file);
        return "redirect:allFile";
    }
    /**
     * 根据id删除文件
     */
    @RequestMapping("/delete/{id}")
    public String deleteFile(@PathVariable("id") Integer id){
        fileService.deleteFileById(id);
        return "redirect:/file/allFile";
    }

}
