package org.spring.io;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest({"fileName=./trades","spring.cloud.task.closecontextEnabled=false"})
public class FileTaskApplicationTests {

	@Test
	public void contextLoads() {
	}

}
