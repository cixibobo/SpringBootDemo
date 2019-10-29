package com.ht.boot2080417.po;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class TblCalendar implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7928426186637217054L;
	//0定义字段
	private int id;
	private String title;
	private String content;
	private int ifOK;
	private int importance;
	@JSONField(format="yyyy-MM-dd hh:mm:ss")
	private Date finishDate;
	@JSONField(format="yyyy-MM-dd hh:mm:ss")
	private Date recordDate;
	//1定义属性 alt+shift+s
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getIfOK() {
		return ifOK;
	}
	public void setIfOK(int ifOK) {
		this.ifOK = ifOK;
	}
	public int getImportance() {
		return importance;
	}
	public void setImportance(int importance) {
		this.importance = importance;
	}
	public Date getFinishDate() {
		return finishDate;
	}
	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}
	public Date getRecordDate() {
		return recordDate;
	}
	public void setRecordDate(Date recordDate) {
		this.recordDate = recordDate;
	}
	//2封装

	
	//3空构造 alt+shift+s
	public TblCalendar() {
		super();
	}	
	//4构造重载 alt+shift+s
	public TblCalendar(String title, String content, int ifOK, int importance, Date finishDate) {
		super();
		this.title = title;
		this.content = content;
		this.ifOK = ifOK;
		this.importance = importance;
		this.finishDate = finishDate;
	}
	//5重写toString() alt+shift+s
	@Override
	public String toString() {
		return "TblCalendar [id=" + id + ", title=" + title + ", content=" + content + ", ifOK=" + ifOK
				+ ", importance=" + importance + ", finishDate=" + finishDate + ", recordDate=" + recordDate + "]";
	}
	
}
