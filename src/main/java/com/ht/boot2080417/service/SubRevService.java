package com.ht.boot2080417.service;

import com.ht.boot2080417.po.TblSubRev;

public interface SubRevService {
    /**
     *
     * @param TblSubRev
     * @return
     */
    public int subRevInsert(TblSubRev tblSubRev);
    /**
     *
     * @param bossId
     * @return
     */
    public TblSubRev subRevSelectOne(int bossId);



}
