package jenkinsjava;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testAdd {
	Add add;
	@BeforeEach
	void setUp() throws Exception {
		add = new Add(1,1);
	}

	@Test
	void test() {
		assertEquals(2, add.add());
//		fail("Not yet implemented");
	}

}
