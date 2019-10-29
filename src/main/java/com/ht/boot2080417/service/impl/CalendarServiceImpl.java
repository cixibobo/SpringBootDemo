package com.ht.boot2080417.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ht.boot2080417.dao.CalendarDao;
import com.ht.boot2080417.po.TblCalendar;
import com.ht.boot2080417.service.CalendarServivce;

@Service
public class CalendarServiceImpl implements CalendarServivce {
	
	//定义一个生产部分
	//CalendarDao calendarDao=new CalendarDao();
	@Autowired  
	private CalendarDao calendarDao;
	
	@Override
	public int calendarInsert(TblCalendar tblCalendar) {
		// TODO Auto-generated method stub
		return calendarDao.calendarInsert(tblCalendar);
	}

	@Override
	public int calendarDelete(int id) {
		// TODO Auto-generated method stub
		return calendarDao.calendarDelete(id);
	}

	@Override
	public int calendarUpdate(TblCalendar tblCalendar) {
		// TODO Auto-generated method stub
		return calendarDao.calendarUpdate(tblCalendar);
	}

	@Override
	public TblCalendar calendarSelectOne(int id) {
		// TODO Auto-generated method stub
		return calendarDao.calendarSelectOne(id);
	}

	/**
	 * 页面传递过来的数字是np
	 * 但是业务层需要对np进行操控,使其-1
	 */
	@Override
	public List<TblCalendar> calendarSelectAll(int np, int size) {
		// TODO Auto-generated method stub
		return calendarDao.calendarSelectAll((np-1)*size, size);
	}

}
