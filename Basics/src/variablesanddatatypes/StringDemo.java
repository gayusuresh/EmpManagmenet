package variablesanddatatypes;

public class StringDemo {

	public static void main(String[] args) {
		String s="HELLO";//literal
		System.out.println(s);
		String s1=new String("hello");//new object
		System.out.println(s1);
		
		String s2="hello";
		System.out.println(s.equals(s2));
		System.out.println(s.charAt(4));
		System.out.println(s.lastIndexOf('l'));
		System.out.println(s.indexOf('l'));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.trim());
		System.out.println(s.equalsIgnoreCase(s2));
		System.out.println(s.concat("hai"));
		System.out.println(s);

	}

}
