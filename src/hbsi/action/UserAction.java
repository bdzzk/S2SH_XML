package hbsi.action;

import hbsi.domain.User;
import hbsi.service.UserService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User> {
	private User user = new User();
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return this.user;
	}
	
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	//Ìí¼ÓÊý¾Ý
	public String add(){
		this.userService.saveUser(user);
		return "add";
	}
	

}
