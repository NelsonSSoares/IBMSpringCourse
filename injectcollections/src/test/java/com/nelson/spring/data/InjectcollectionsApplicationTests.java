package com.nelson.spring.data;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InjectcollectionsApplicationTests {
	
	@Autowired
	List<String> courseList;
	
	@Test
	void testListInjection() {
		System.out.println(courseList);
	}

}
