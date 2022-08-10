package variablesanddatatypes;

public class StudentMark {

	public static void main(String[] args) {
		int sid=10001;
		String sname="Anu";
		int sub1=90,sub2=78,sub3=96,sub4=87,sub5=67;
		int total=sub1+sub2+sub3+sub4+sub5;
		System.out.println("Student Id=:"+sid);
		System.out.println("Student Name=:"+sname);
		System.out.println("The Total=:"+total);
		double percentage=(total*100.0)/500;
		System.out.println("The Percentage=:"+percentage);

	}

}
