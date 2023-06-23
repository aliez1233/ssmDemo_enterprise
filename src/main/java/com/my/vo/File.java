package com.my.vo;

public class File {
    private Integer fileId;
    private String fileTitle;
    private String fromUserName;
    private String toUserName;
    private String fileStatus;

    public File() {
    }

    public File(Integer fileId, String fileTitle, String fromUserName, String toUserName, String fileStatus) {
        this.fileId = fileId;
        this.fileTitle = fileTitle;
        this.fromUserName = fromUserName;
        this.toUserName = toUserName;
        this.fileStatus = fileStatus;
    }

    @Override
    public String toString() {
        return "File{" +
                "fileId=" + fileId +
                ", fileTitle='" + fileTitle + '\'' +
                ", fromUserName='" + fromUserName + '\'' +
                ", toUserName='" + toUserName + '\'' +
                ", fileStatus='" + fileStatus + '\'' +
                '}';
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public String getFileTitle() {
        return fileTitle;
    }

    public void setFileTitle(String fileTitle) {
        this.fileTitle = fileTitle;
    }

    public String getFromUserName() {
        return fromUserName;
    }

    public void setFromUserName(String fromUserName) {
        this.fromUserName = fromUserName;
    }

    public String getToUserName() {
        return toUserName;
    }

    public void setToUserName(String toUserName) {
        this.toUserName = toUserName;
    }

    public String getFileStatus() {
        return fileStatus;
    }

    public void setFileStatus(String fileStatus) {
        this.fileStatus = fileStatus;
    }
}
