package bootatrap;

import org.junit.Test;

public class Qqqq {

	private UserService userService;
	@Test
	public void testAddUser(){
		userService = new UserService();
		User user = new User();
		user.setAge(1);
		user.setName("aa");
		userService.addUser(user);
	}
}
