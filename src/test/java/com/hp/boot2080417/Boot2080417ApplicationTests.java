package com.hp.boot2080417;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ht.boot2080417.service.CalendarServivce;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Boot2080417ApplicationTests {
	
	@Autowired
	private CalendarServivce calendarServivce;
	@Test
	public void contextLoads() {
		Assert.assertEquals(calendarServivce.calendarDelete(10), 0);
	}

}
