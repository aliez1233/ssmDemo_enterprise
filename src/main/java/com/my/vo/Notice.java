package com.my.vo;

public class Notice {
    private Integer noticeId;
    private String title;
    private String detail;
    private String noticeDate;

    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getNoticeDate() {
        return noticeDate;
    }

    public void setNoticeDate(String noticeDate) {
        this.noticeDate = noticeDate;
    }

    public Notice(Integer noticeId, String title, String detail, String noticeDate) {
        this.noticeId = noticeId;
        this.title = title;
        this.detail = detail;
        this.noticeDate = noticeDate;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "noticeId=" + noticeId +
                ", title='" + title + '\'' +
                ", detail='" + detail + '\'' +
                ", noticeDate='" + noticeDate + '\'' +
                '}';
    }

    public Notice() {
    }
}
