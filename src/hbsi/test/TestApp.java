package hbsi.test;

import hbsi.domain.User;
import hbsi.service.UserService;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestApp {
	@Test
	public void demo01() {
		User user = new User();
		user.setUsername("zzk");
		user.setPassword("123456");
		String xmlPath = "applicationContext.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				xmlPath);
		UserService userService = applicationContext.getBean("userService",
				UserService.class);
		userService.saveUser(user);
		System.out.println("OK");
	}
}
