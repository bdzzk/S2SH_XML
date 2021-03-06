package hbsi.service;

import java.util.List;

import hbsi.domain.User;

public interface UserService {
	public void saveUser(User user);
	public void updateUser(User user);
	public void deleteUser(User user);
	public User findUserById(Integer id);
	public List<User> findAllUser();
}
