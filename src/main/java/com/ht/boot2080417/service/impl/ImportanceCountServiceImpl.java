package com.ht.boot2080417.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ht.boot2080417.dao.ImportanceCountDao;
import com.ht.boot2080417.po.TempImportanceCount;
import com.ht.boot2080417.service.ImportanceCountService;

@Service
public class ImportanceCountServiceImpl implements ImportanceCountService {

	@Autowired
	private ImportanceCountDao ImportanceCountDao;
	@Override
	public List<TempImportanceCount> importanceCountSelectAll() {
		// TODO Auto-generated method stub
		return ImportanceCountDao.importanceCountSelectAll();
	}

}
