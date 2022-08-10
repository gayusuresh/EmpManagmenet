package classandobject;

public class Addtion 
{
	int x;//fields
	int y;

 Addtion()
 {
	 x=23;
	 y=89;
 }
 Addtion(int i,int j)//i=23 j=78
 {
	 x=i;//x=23
	 y=j;//y=78
 }
 int calculateSum()//methods with return type
 {
	 int sum=x+y;//23+78=
	 return sum;
 }
 
 public String toString()
 {
	 return "X="+x+"Y=:"+y+"Sum=:"+calculateSum();
 }
}
