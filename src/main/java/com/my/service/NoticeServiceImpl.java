package com.my.service;

import com.my.dao.NoticeDao;
import com.my.vo.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService{
    @Autowired
    NoticeDao noticeDao;
    public List<Notice> queryAllNotice(){
        return noticeDao.queryAllNotice();

    }
    public int insertNotice(Notice notice){
        int i=noticeDao.insertNotice(notice);
        return i;
    }
    public int updateNotice(Notice notice){
        int i=noticeDao.updateNotice(notice);
        return i;
    }
    public Notice queryNoticeById(int id){
        return noticeDao.queryNoticeById(id);
    }
    public int deleteNoticeById(int id){
        int i=noticeDao.deleteNoticeById(id);
        return i;
    }
}
