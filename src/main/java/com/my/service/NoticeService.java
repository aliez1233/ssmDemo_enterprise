package com.my.service;

import com.my.vo.Notice;

import java.util.List;

public interface NoticeService {
    List<Notice> queryAllNotice();

    int insertNotice(Notice notice);
    int updateNotice(Notice notice);
    Notice queryNoticeById(int id);
    int deleteNoticeById(int id);

}
