package loops;

public class AlphabetExample {

	public static void main(String[] args) {
		for(char alph='A';alph<='C';alph++)//A<=C B<=C C<=C D<=C
		{
			for(char alpha1='A';alpha1<='C';alpha1++)//A<=C B<=C C<=C D<=C=f
			{
				System.out.print(alph);//AAA
				                       //BBB
				                       //CCC
			}
			System.out.println();//nextline
		}

	}

}
