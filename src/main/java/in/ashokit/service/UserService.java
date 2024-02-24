package in.ashokit.service;

import in.ashokit.dao.UserDao;

public class UserService {

	private UserDao userDao;

	public UserService(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public String  getName(Integer id) {
		String name = userDao.findNameById(id);
		return name;
	}
	
	public Integer getId(String name) {
		Integer userId = userDao.findIdByName(name);
		return userId;
		
	}
	
	public String login(String email, String pass) {
		boolean status = userDao.findEmailAndPass(email, pass);
		if(status) {
			return "Sucess";
		}
		else {
			return "Fail";
		}
	}

}
