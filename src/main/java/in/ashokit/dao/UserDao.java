package in.ashokit.dao;

public interface UserDao {
	
	public String findNameById(Integer id);
	
	public Integer findIdByName(String name);
	
	public boolean findEmailAndPass(String email, String pass);

}
