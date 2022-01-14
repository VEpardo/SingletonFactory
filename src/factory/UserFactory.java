package factory;

public class UserFactory {
	
	   public User getUser(String userType){
		   
		   User user = null;
		   switch(userType.toLowerCase()) {
		   	
		   case "project leader":
			   user = new ProjectLeader();
			   break;
			   
		   case "functional analyst":
			   user = new FunctionalAnalyst();
			   break;
		   case "developer":
			   user = new Developer();
			   break;
		   case "qa":
			   user = new QA();
			   break;
		   case "ers":
			   user = new ERS();
			   break;
		   default: System.out.println("No such User exists.");
		   			break;
		   }
		      return user;
		      
	}
}
