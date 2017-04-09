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
public class QqqqTest extends TestCase{
	private UserService userService;
	@Test
	public void testDeleteUser(){
		userService = new UserService();
		User user = new User();
		user.setAge(1);
		user.setName("aa");
		userService.deleteUser(user);
	}}
