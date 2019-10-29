package com.ht.boot2080417.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.ht.boot2080417.po.TblCalendar;
import com.ht.boot2080417.service.CalendarServivce;

@RestController
public class CalendarController {
	
	@Autowired
	private CalendarServivce calendarServivce;
	
	@RequestMapping("/calendarInsert")
	public Object calendarInsert(HttpServletRequest req,HttpServletResponse resp) {
		String title=req.getParameter("title");
		String content=req.getParameter("content");
		int ifOK=Integer.parseInt(req.getParameter("ifOK"));
		int importance=Integer.parseInt(req.getParameter("importance"));
		String finishDate=req.getParameter("finishDate");
		TblCalendar tblCalendar = null;
		try {
			tblCalendar = new TblCalendar(title, content, ifOK, importance, 
					new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(finishDate));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return calendarServivce.calendarInsert(tblCalendar);
		
	}

	@RequestMapping("/calendarDelete")
	public Object calendarDelete(HttpServletRequest req,HttpServletResponse resp) {
		String id=req.getParameter("id");
		return calendarServivce.calendarDelete(Integer.parseInt(id));
	}
	
	@RequestMapping("/calendarUpdate")
	public Object calendarUpdate(HttpServletRequest req,HttpServletResponse resp) {
		
		String id = req.getParameter("id");
		String title=req.getParameter("title");
		int importance=Integer.parseInt(req.getParameter("importance"));
		String finishDate=req.getParameter("finishDate");
		TblCalendar tblCalendar = new TblCalendar();
		try {
			tblCalendar.setId(Integer.parseInt(id));
			tblCalendar.setTitle(title);
			tblCalendar.setImportance(importance);
			tblCalendar.setFinishDate(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(finishDate));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (calendarServivce.calendarUpdate(tblCalendar)) ;
		
	}	
	
	@RequestMapping("/calendarSelectOne")
	public Object calendarSelectOne(HttpServletRequest req,HttpServletResponse resp) {
		String id=req.getParameter("id");
		return JSON.toJSONString(calendarServivce.calendarSelectOne(Integer.parseInt(id))) ;
	}
	
	@RequestMapping("/calendarSelectAll")
	public Object calendarSelectAll(HttpServletRequest req,HttpServletResponse resp) {
		String np=req.getParameter("np");
		return JSON.toJSONString(calendarServivce.calendarSelectAll(Integer.parseInt(np), 5)) ;
	}	
}
