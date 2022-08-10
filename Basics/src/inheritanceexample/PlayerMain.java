package inheritanceexample;

public class PlayerMain {

	public static void main(String[] args) {
		Batsman b=new Batsman(12345,"dhoni","mumbai",1000,500,78,100,200);
		System.out.println(b);
		Bowler b1=new Bowler(3456,"virat","Hyderbad",500,1000,67,9);
		System.out.println(b1);

	}

}
