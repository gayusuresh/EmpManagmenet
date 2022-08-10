package exceptionhandling;

public class PositiveOrNegative {
      public static void checkPositive(int num) 
      {
    	  if(num>=0)
    	  {
    		  System.out.println("positive number");
    	  }
    	  else
    	  {
    		  try
    		  {
    		  throw new Exception("negative number");
    		  }
    		  catch(Exception e)
    		  {
    			  System.out.println(e);
    		  }
    		  finally
        	  {
        		  System.out.println("hello");
        	  }
    	  }
    	  
      }
	public static void main(String[] args) throws Exception {
		checkPositive(-1);
        System.out.println("hello");
        
	}

}
