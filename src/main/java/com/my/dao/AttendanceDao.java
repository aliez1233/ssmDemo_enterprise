package com.my.dao;

import com.my.vo.Attendance;

import java.util.List;

public interface AttendanceDao {
    //查询所有的考勤信息,返回list集合
    List<Attendance> queryAllAttendance();
    //添加一则考勤信息
    int insertAttendance(Attendance attendance);
    //更新考勤信息
    int updateAttendance(Attendance attendance);
    //根据id查询，返回一则考勤信息
    Attendance queryAttendanceById(int id);
    //根据id删除一则考勤信息
    int deleteAttendanceById(int id);
}
