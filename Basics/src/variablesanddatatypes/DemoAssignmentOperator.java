package variablesanddatatypes;

public class DemoAssignmentOperator {

	public static void main(String[] args) {
		int a=12;
		int b=7;
		System.out.println("The Ans=:"+(a+=b));//a=a+b
		System.out.println("A=:"+a);
		System.out.println("B=:"+b);
		System.out.println("The Ans=:"+(a-=b));//a=a-b;a=12-7=5
		System.out.println("The Ans=:"+(b-=a));//b=b-a;
		System.out.println("The Ans=:"+(a*=b));//a=a*b

	}

}
