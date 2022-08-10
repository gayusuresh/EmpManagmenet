package stringexample;

public class Demo {

	public static void main(String[] args) {
		String s="welcome";//literal
		String s1="hello";
		System.out.println(s);
		System.out.println(s1);
      System.out.println(s.charAt(3));
      System.out.println(s.indexOf('h'));
      System.out.println(s.toLowerCase());
      System.out.println(s.toUpperCase());
      System.out.println(s.concat("hai"));
      System.out.println(s.trim());
      System.out.println(s.lastIndexOf('l'));
      System.out.println(s.indexOf('l'));
      System.out.println(s.equals(s1));
      System.out.println(s.substring(0,3));
      System.out.println(s);
      System.out.println(s.compareTo(s1));
      System.out.println(s.length());
      System.out.println(s.replace('w', 'H'));
      String s4=s1.intern();
      System.out.println(s1==s4);
	}

}
