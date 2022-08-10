package abstraction;

public class ShapeMain {

	public static void main(String[] args) {
		Shape c=new Circle(45);
		System.out.println(c);
		Rectangle r=new Rectangle(45,78);
		System.out.println(r);
		c.display();
		Shape.display1();

	}

}
