package com.my.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.my.service.EmployeeService;
import com.my.vo.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("/employee")
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    /**
     * 查找所有的书
     *
     * @param pn
     * @param model
     * @return
     */
    @RequestMapping("/allEmployee")
    public String queryAllEmployee(@RequestParam(name = "pn", defaultValue = "1") Integer pn, Model model) {
        PageHelper.startPage(pn, 10);// 第pn页，每页10条记录
        List<Employees> employee = employeeService.queryAllEmployee();
        // 用PageInfo对结果进行包装
        PageInfo pageInfo = new PageInfo(employee);
        model.addAttribute("pageInfo", pageInfo);
        return "allEmployee";
    }
    /**
     * 跳转到添加图书页面
     */
    @RequestMapping("/toAddEmployee")
    public String toAddEmployee() {

        return "addEmployee";
    }

    /**
     * 添加一本书到数据库
     * 重定向到分页查找页面
     */
    @RequestMapping("/addEmployee")
    public String addEmployee(Employees employee) {
        employeeService.insertEmployee(employee);
        return "redirect:allEmployee";

    }
    /**
     * 跳转到修改图书页面
     */
    @RequestMapping("/toUpdateEmployee")
    public String toUpdateEmployee(Integer id,Model model) {
        Employees employee = employeeService.queryEmployeeById(id);
        model.addAttribute("employee", employee);
        return "updateEmployee";
    }

    /**
     * 数据库中更新图书
     * 重定向到分页查找页面
     */
    @RequestMapping("/updateEmployee")
    public String updateEmployee(Employees employee) {
        employeeService.updateEmployee(employee);
        return "redirect:allEmployee";

    }
    /**
     * 根据id删除书籍
     */
    @RequestMapping("/del/{EmployeeId}")
    public String delEmployee(@PathVariable("EmployeeId") Integer EmployeeId) {
        employeeService.deleteEmployeeById(EmployeeId);
        return "redirect:/employee/allEmployee";

    }
}
