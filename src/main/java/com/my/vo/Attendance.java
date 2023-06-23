package com.my.vo;

public class Attendance {
    private Integer attendanceId;
    private Integer employeeId;
    private String employeeName;
    private String appearTimes;
    private String leaveTimes;
    private String lateEarlyLeave;
    private String absentWork;
    private String overtime;

    @Override
    public String toString() {
        return "Attendance{" +
                "attendanceId=" + attendanceId +
                ", employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", appearTimes='" + appearTimes + '\'' +
                ", leaveTimes='" + leaveTimes + '\'' +
                ", lateEarlyLeave='" + lateEarlyLeave + '\'' +
                ", absentWork='" + absentWork + '\'' +
                ", overtime='" + overtime + '\'' +
                '}';
    }

    public Attendance() {
    }

    public Attendance(Integer attendanceId, Integer employeeId, String employeeName, String appearTimes, String leaveTimes, String lateEarlyLeave, String absentWork, String overtime) {
        this.attendanceId = attendanceId;
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.appearTimes = appearTimes;
        this.leaveTimes = leaveTimes;
        this.lateEarlyLeave = lateEarlyLeave;
        this.absentWork = absentWork;
        this.overtime = overtime;
    }

    public Integer getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(Integer attendanceId) {
        this.attendanceId = attendanceId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getAppearTimes() {
        return appearTimes;
    }

    public void setAppearTimes(String appearTimes) {
        this.appearTimes = appearTimes;
    }

    public String getLeaveTimes() {
        return leaveTimes;
    }

    public void setLeaveTimes(String leaveTimes) {
        this.leaveTimes = leaveTimes;
    }

    public String getLateEarlyLeave() {
        return lateEarlyLeave;
    }

    public void setLateEarlyLeave(String lateEarlyLeave) {
        this.lateEarlyLeave = lateEarlyLeave;
    }

    public String getAbsentWork() {
        return absentWork;
    }

    public void setAbsentWork(String absentWork) {
        this.absentWork = absentWork;
    }

    public String getOvertime() {
        return overtime;
    }

    public void setOvertime(String overtime) {
        this.overtime = overtime;
    }
}
