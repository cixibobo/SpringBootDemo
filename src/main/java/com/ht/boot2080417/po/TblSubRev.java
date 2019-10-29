package com.ht.boot2080417.po;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

public class TblSubRev implements Serializable {
    /**
     *
     */
   //private static final long serialVersionUID = 7928426186637217054L;
    //0定义字段
    private int bossId;
    private String bossName;
    private String contactId;
    private String partildList;
    private String partNameList;
    private String address;
    private String date;
    private String topic;

    public int getBossId() {
        return bossId;
    }

    public void setBossId(int bossId) {
        this.bossId = bossId;
    }

    public String getBossName() {
        return bossName;
    }

    public void setBossName(String bossName) {
        this.bossName = bossName;
    }

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public String getPartildList() {
        return partildList;
    }

    public void setPartildList(String partildList) {
        this.partildList = partildList;
    }

    public String getPartNameList() {
        return partNameList;
    }

    public void setPartNameList(String partNameList) {
        this.partNameList = partNameList;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "TblSubRev{" +
                "bossId=" + bossId +
                ", bossName='" + bossName + '\'' +
                ", contactId='" + contactId + '\'' +
                ", partildList='" + partildList + '\'' +
                ", partNameList='" + partNameList + '\'' +
                ", address='" + address + '\'' +
                ", date='" + date + '\'' +
                ", topic='" + topic + '\'' +
                '}';
    }
}
