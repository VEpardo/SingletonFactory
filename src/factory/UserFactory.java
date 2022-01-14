package factory;

public class UserFactory {
	
	   public User getUser(String userType){
		      if(userType == null){
		         return null;
		      }		
		      if(userType.equalsIgnoreCase("PROJECT LEADER")){
		         return new ProjectLeader();
		         
		      } else if(userType.equalsIgnoreCase("FUNCTIONAL ANALYST")){
		         return new FunctionalAnalyst();
		         
		      } else if(userType.equalsIgnoreCase("DEVELOPER")){
		         return new Developer();
		      }
	   		   else if(userType.equalsIgnoreCase("QA")){
	   			  return new QA();
	   		  }
			   else if(userType.equalsIgnoreCase("ERS")){
				return new ERS();
			  }
		      
		      return null;
		      
	}
}
