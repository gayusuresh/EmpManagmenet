package exceptionhandling;

public class FiveDigitNumber
{
	public static void fiveDigit(int number) throws NumberFormatException,Exception
	{
		if(number>=10000 && number<=99999)
		{
			System.out.println("five digit number");
		}
		else
		{
			
			throw new Exception("not a five digit number");
			
			
		}
	}

	public static void main(String[] args) {
		try {
			fiveDigit(345670);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
