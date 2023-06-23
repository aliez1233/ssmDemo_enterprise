package com.my.dao;

import com.my.vo.Notice;

import java.util.List;

public interface NoticeDao {
    //查询所有的公告,返回list集合
    List<Notice> queryAllNotice();
    //添加一则公告
    int insertNotice(Notice notice);
    //更新公告
    int updateNotice(Notice notice);
    //根据id查询，返回一则公告
    Notice queryNoticeById(int id);
    //根据id删除一则公告
    int deleteNoticeById(int id);

}
