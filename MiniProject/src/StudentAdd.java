import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentAdd
{
	public void addData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id");
		int sid1=sc.nextInt();
		System.out.println("enter the name");
		String sname1=sc.next();
		System.out.println("enter the address");
		String saddress1=sc.next();
		
		List<Student>list=new ArrayList<Student>();
		Student s1=new Student(sid1,sname1,saddress1);
		System.out.println("enter the id");
		int sid2=sc.nextInt();
		System.out.println("enter the name");
		String sname2=sc.next();
		System.out.println("enter the address");
		String saddress2=sc.next();
		Student s2=new Student(sid2,sname2,saddress2);
		Student s3=new Student(13,"gayathri","kknagar");
		list.add(s1);
		list.add(s2);
		list.add(s3);
		for(Student s:list)
		{
			System.out.println(s);
		}
	}

}
