package bootatrap;

public class UserService {
	public void addUser(User user){
		System.out.println("Add User !");
	}
	public void deleteUser(User user){
		System.out.println("delete User !");
	}
	public void queryUser(int age){
		System.out.println("query User by age:"+age);
	}
	public void updateUser(User user){
		System.out.println("update User by age:"+user.getAge());
	}
	public void getUsers(){
		System.out.println("Get Users !");
	}
}
