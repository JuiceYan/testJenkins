/**
 * 
 */
package bootatrap;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * @author Administrator
 *
 */
public class QqqqTest2 extends TestCase{
	private UserService userService;
	@Test
	public void testgetUser(){
		userService = new UserService();
		User user = new User();
		user.setAge(1);
		user.setName("aa");
		userService.getUsers();
	}
}
