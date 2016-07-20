package hbsi.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
// import org.apache.commons.logging.Log;
// import org.apache.commons.logging.LogFactory;

import hbsi.dao.UserDao;
import hbsi.domain.User;
import hbsi.service.UserService;

public class UserServiceImpl implements UserService {
	private static Logger logger=Logger.getLogger(UserServiceImpl.class.getName());
	// ʹ��CommonsLogging�������־��¼��ʵ��
	// ������Ӧ����
	// import org.apache.commons.logging.Log;
	// import org.apache.commons.logging.LogFactory;
	//private static Log logger = LogFactory.getLog(CommonLoggingTest.class);
	//private static Logger logger = LogManager.getLogger(UserServiceImpl.class.getName());
	private UserDao userDao;
	

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void saveUser(User user) {
		logger.debug("save before......");
		this.userDao.save(user);
		logger.debug("save after......");
	}

	@Override
	public void updateUser(User user) {
		//ǰ����
		this.userDao.update(user);
		//����
	}

	@Override
	public void deleteUser(User user) {
		this.userDao.delete(user);
		
	}

	@Override
	public User findUserById(Integer id) {
		// TODO Auto-generated method stub
		return this.userDao.findById(id);
	}

	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		return this.userDao.findAll();
	}

}
