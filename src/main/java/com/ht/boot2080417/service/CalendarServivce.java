package com.ht.boot2080417.service;

import java.util.List;

import com.ht.boot2080417.po.TblCalendar;
/**
 * 
 * author laozhang
 * date 20180418
 * descritpion:xxx
 */
public interface CalendarServivce {
	/**
	 * 
	 * @param tblCalendar
	 * @return
	 */
	public int calendarInsert(TblCalendar tblCalendar);
	/**
	 * 
	 * @param id
	 * @return
	 */
	public int calendarDelete(int id);	
	
	/**
	 * 
	 * @param tblCalendar
	 * @return
	 */
	public int calendarUpdate(TblCalendar tblCalendar);
	/**
	 * 
	 * @param id
	 * @return
	 */
	public TblCalendar calendarSelectOne(int id);	
	/**
	 * 
	 * @param np
	 * @param size
	 * @return
	 */
	public List<TblCalendar> calendarSelectAll(int np,int size);
}
