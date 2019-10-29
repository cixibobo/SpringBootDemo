package com.ht.boot2080417.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.ht.boot2080417.po.TempImportanceCount;

@Mapper
public interface ImportanceCountDao {
	
	@Select("select importance,count(id) importanceCount from tblCalendar group by importance ")
	public List<TempImportanceCount> importanceCountSelectAll();
}
