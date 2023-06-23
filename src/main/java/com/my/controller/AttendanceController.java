package com.my.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.my.service.AttendanceService;
import com.my.vo.Attendance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("/attendance")
@Controller
public class AttendanceController {
    @Autowired
    private AttendanceService attendanceService;
    /**
     * 查找所有的考勤信息
     *
     * @param pn
     * @param model
     * @return
     */
    @RequestMapping("/allAttendance")
    public String queryAllAttendance(@RequestParam(name = "pn", defaultValue = "1") Integer pn, Model model) {
        PageHelper.startPage(pn, 10);
        List<Attendance> attendances=attendanceService.queryAllAttendance();
        PageInfo pageInfo = new PageInfo(attendances);
        model.addAttribute("pageInfo", pageInfo);
        return "allAttendance";
    }
    /**
     * 跳转到添加考勤信息页面
     */
    @RequestMapping("/toAddAttendance")
    public String toAddAttendance(){
        return "addAttendance";
    }
    /**
     * 添加一则考勤信息到数据库
     * 重定向到分页查找页面
     */
    @RequestMapping("/addAttendance")
    public String addAttendance(Attendance attendance){
        attendanceService.insertAttendance(attendance);
        return "redirect:allAttendance";
    }
    /**
     * 跳转到修改考勤信息页面
     */
    @RequestMapping("/toUpdateAttendance")
    public String toUpdateAttendance(Integer id,Model model){
        Attendance attendance=attendanceService.queryAttendanceById(id);
        model.addAttribute("attendance",attendance);
        return "updateAttendance";
    }
    /**
     * 数据库中更新考勤信息
     * 重定向到分页查找页面
     */
    @RequestMapping("/updateAttendance")
    public String updateAttendance(Attendance attendance){
        attendanceService.updateAttendance(attendance);
        return "redirect:allAttendance";
    }
    /**
     * 根据id删除考勤信息
     */
    @RequestMapping("/delete/{id}")
    public String deleteAttendance(@PathVariable("id")Integer id){
        attendanceService.deleteAttendanceById(id);
        return "redirect:/attendance/allAttendance";
    }
}
