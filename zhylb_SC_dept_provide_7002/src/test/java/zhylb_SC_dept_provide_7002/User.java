package zhylb_SC_dept_provide_7002;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class User {
	@Autowired
	private static   User user;
	@Test
	public static void UserEntity() {
		/*System.out.println(user.getUserName());*/
	}
	
}
