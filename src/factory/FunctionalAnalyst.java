package factory;

public class FunctionalAnalyst implements User{

	@Override
	public void create() {
		System.out.println("Inside FunctionalAnalyst::create() method");
	}
	
}
