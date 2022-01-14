package factory;

public class Developer implements User{

	@Override
	public void create() {
		System.out.println("Inside Developer::create() method");
	}
	
}
