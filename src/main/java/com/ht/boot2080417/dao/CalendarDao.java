package com.ht.boot2080417.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.ht.boot2080417.po.TblCalendar;

@Mapper
public interface CalendarDao {
	
	//insert
	@Insert("insert into tblCalendar(title,content,ifOK,importance,finishDate)"
			+ " values(#{title},#{content},#{ifOK},#{importance},#{finishDate})")
	public int calendarInsert(TblCalendar tblCalendar);
	//delete
	@Delete("delete from tblCalendar where id = #{id}")
	public int calendarDelete(int id);	
	//update
	@Update("update tblCalendar set title=#{title},importance=#{importance},"
			+ "finishDate=#{finishDate} where id =#{id}")
	public int calendarUpdate(TblCalendar tblCalendar);
	//selectOne
	@Select("select * from tblCalendar where id = #{id} order by id desc limit 1 ")
	public TblCalendar calendarSelectOne(int id);	
	//selectAll
	@Select("select * from tblCalendar order by id asc limit #{np},#{size}")
	public List<TblCalendar> calendarSelectAll(@Param("np") int np,@Param("size") int size);
}
