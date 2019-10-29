package com.ht.boot2080417.dao;


import com.ht.boot2080417.po.TblSubRev;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SubRevDao {
    //insert
    @Insert("insert into tblsubReservation(bossName,contactId,partildList,partNameList,address,date,time,topic)"
            + " values(#{bossName},#{contactId},#{partildList},#{partNameList},#{address}),#{date},#{time},#{topic}")
    public int subRevInsert(TblSubRev tblSubRev);

    //selectToOne

    @Select("select * from tblsubReservation where bossid = #{bossid}  limit 1 ")
    public TblSubRev subRevSelectOne(int bossid);

}
