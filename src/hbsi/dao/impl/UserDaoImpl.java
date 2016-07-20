package hbsi.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import hbsi.dao.UserDao;
import hbsi.domain.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
	
	@Override
	public void save(User user) {
		this.getHibernateTemplate().save(user);		
	}

	@Override
	public void update(User user) {
		this.getHibernateTemplate().update(user);
	}

	@Override
	public void delete(User user) {
		this.getHibernateTemplate().delete(user);
		
	}

	@Override
	public User findById(Integer id) {		
		return this.getHibernateTemplate().get(User.class, id);
	}

	@Override
	public List<User> findAll() {		
		return this.getHibernateTemplate().find("from User");
	}

}
