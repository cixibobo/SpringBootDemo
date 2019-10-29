package com.ht.boot2080417.service.impl;

import com.ht.boot2080417.dao.SubRevDao;
import com.ht.boot2080417.po.TblSubRev;
import com.ht.boot2080417.service.SubRevService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubRevServiceImpl implements SubRevService {
    //定义一个生产部分
    //
    @Autowired
    private SubRevDao subRevDao;

    @Override
    public int subRevInsert(TblSubRev tblSubRev) {
        // TODO Auto-generated method stub
        return subRevDao.subRevInsert(tblSubRev);
    }

    @Override
    public TblSubRev subRevSelectOne(int bossId) {
        return subRevDao.subRevSelectOne(bossId);
    }
}
