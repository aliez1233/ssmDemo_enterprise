package com.my.vo;

public class Finance {
    private Integer FinanceId;
    private String FinanceName;
    private String FinanceType;
    private String EmployeeName;
    private String Money;

    public Finance() {
    }

    public Integer getFinanceId() {
        return FinanceId;
    }

    public Finance(Integer financeId, String financeName, String financeType, String employeeName, String money) {
        FinanceId = financeId;
        FinanceName = financeName;
        FinanceType = financeType;
        EmployeeName = employeeName;
        Money = money;
    }

    @Override
    public String toString() {
        return "Finance{" +
                "FinanceId=" + FinanceId +
                ", FinanceName='" + FinanceName + '\'' +
                ", FinanceType='" + FinanceType + '\'' +
                ", EmployeeName='" + EmployeeName + '\'' +
                ", Money='" + Money + '\'' +
                '}';
    }

    public void setFinanceId(Integer financeId) {
        FinanceId = financeId;
    }

    public String getFinanceName() {
        return FinanceName;
    }

    public void setFinanceName(String financeName) {
        FinanceName = financeName;
    }

    public String getFinanceType() {
        return FinanceType;
    }

    public void setFinanceType(String financeType) {
        FinanceType = financeType;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public String getMoney() {
        return Money;
    }

    public void setMoney(String money) {
        Money = money;
    }
}
