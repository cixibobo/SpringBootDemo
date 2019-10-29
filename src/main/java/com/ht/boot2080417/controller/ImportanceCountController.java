package com.ht.boot2080417.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ht.boot2080417.service.ImportanceCountService;

@RestController
public class ImportanceCountController {
	
	@Autowired
	private ImportanceCountService importanceCountService;
	
	@RequestMapping("/importanceCountSelect")
	public Object importanceCountSelect() {
		return importanceCountService.importanceCountSelectAll();
	}
}
