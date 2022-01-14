package factory;

public class ProjectLeader implements User{
	
	@Override
	public void create() {
		System.out.println("Inside ProjectLeader::create() method");
	}
	
}
