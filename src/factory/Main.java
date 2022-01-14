package factory;

public class Main {

	   public static void main(String[] args) {
	      UserFactory userFactory = new UserFactory();

	      User user1 = userFactory.getUser("Project Leader");
	      user1.create();

	      User user2 = userFactory.getUser("Functional Analyst");
	      user2.create();

	      User user3 = userFactory.getUser("Developer");
	      user3.create();
	   }
	}
