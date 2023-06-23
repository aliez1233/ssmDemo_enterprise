package com.my.service;

import com.my.dao.AttendanceDao;
import com.my.vo.Attendance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AttendanceServiceImpl implements AttendanceService{
    @Autowired
    AttendanceDao attendanceDao;
    public List<Attendance> queryAllAttendance(){
        return attendanceDao.queryAllAttendance();
    }


    public int insertAttendance(Attendance attendance) {
        int i=attendanceDao.insertAttendance(attendance);
        return i;
    }


    public int updateAttendance(Attendance attendance) {
        int i=attendanceDao.updateAttendance(attendance);
        return i;
    }
    public int deleteAttendanceById(int id){
        int i=attendanceDao.deleteAttendanceById(id);
        return i;
    }
   public Attendance queryAttendanceById(int id){
        return attendanceDao.queryAttendanceById(id);
   }
}
