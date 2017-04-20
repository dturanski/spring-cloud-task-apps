package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.task.configuration.TaskProperties;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(properties ={"spring.cloud.task.closecontextEnabled=false"})
public class TaskDemoApplicationTests {

	@Autowired
	TaskProperties taskProperties;
	@Test
	public void contextLoads() {
		
	}

}
