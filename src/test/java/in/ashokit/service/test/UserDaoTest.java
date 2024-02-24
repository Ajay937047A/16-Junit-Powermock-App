package in.ashokit.service.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.powermock.api.mockito.PowerMockito;

import in.ashokit.dao.UserDao;
import in.ashokit.service.UserService;

public class UserDaoTest {

	
	@Test
	public void getNameTest() {
		UserDao userDao = PowerMockito.mock(UserDao.class);
		PowerMockito.when(userDao.findNameById(101)).thenReturn("ajay");
		UserService userService = new UserService(userDao);
		String actualName = userService.getName(101);
		String exceptedName= "ajay";
		assertEquals(actualName, exceptedName);
	}
	
	@Test
	public void getIdTest() {
		UserDao userDao = PowerMockito.mock(UserDao.class);
		PowerMockito.when(userDao.findIdByName("Ajay")).thenReturn(101);
		UserService userService=new UserService(userDao);
		     Integer actualId = userService.getId("Ajay");
		     Integer exceptedId= 101;
		     assertEquals(actualId, exceptedId);
	}
	
	@Test
	public void loginTest() {
		
		UserDao mock = PowerMockito.mock(UserDao.class);
		PowerMockito.when(mock.findEmailAndPass("ajay@gmail", "ajay")).thenReturn(true);
		UserService userService=new UserService(mock);
		String acualStatus = userService.login("ajay@gmail", "ajay");
		String axceptedStatus="Sucess";
		assertEquals(acualStatus, axceptedStatus);
	}
}
