package com.my.vo;

public class Leave {
    private Integer leaveId;
    private String employeeName;
    private String leaveType;
    private String beginTime;
    private String endTime;
    private String applyTime;
    private String remark;
    private String managerTime;
    private String managerState;
    private String managerName;

    public Leave() {
    }

    public Leave(Integer leaveId, String employeeName, String leaveType, String beginTime, String endTime, String applyTime, String remark, String managerTime, String managerState, String managerName) {
        this.leaveId = leaveId;
        this.employeeName = employeeName;
        this.leaveType = leaveType;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.applyTime = applyTime;
        this.remark = remark;
        this.managerTime = managerTime;
        this.managerState = managerState;
        this.managerName = managerName;
    }

    @Override
    public String toString() {
        return "Leave{" +
                "leaveId=" + leaveId +
                ", employeeName='" + employeeName + '\'' +
                ", leaveType='" + leaveType + '\'' +
                ", beginTime='" + beginTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", applyTime='" + applyTime + '\'' +
                ", remark='" + remark + '\'' +
                ", managerTime='" + managerTime + '\'' +
                ", managerState='" + managerState + '\'' +
                ", managerName='" + managerName + '\'' +
                '}';
    }

    public Integer getLeaveId() {
        return leaveId;
    }

    public void setLeaveId(Integer leaveId) {
        this.leaveId = leaveId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getManagerTime() {
        return managerTime;
    }

    public void setManagerTime(String managerTime) {
        this.managerTime = managerTime;
    }

    public String getManagerState() {
        return managerState;
    }

    public void setManagerState(String managerState) {
        this.managerState = managerState;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }
}
