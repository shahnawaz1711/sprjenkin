package p1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SprjenkinApplicationTests {

	static Logger logger = LoggerFactory.getLogger(SprjenkinApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("SprMvnApplicationTests contextLoads STARTED.....");
		logger.info("SHANU SHAIKH.........................");
		assertEquals(true, true);
	}

}
