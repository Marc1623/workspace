
public class TP5_03_ex6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//hyp^2 = cat1^2 + cat2^2

		int a,b,c;

		a=0;
		b=0;
		c=0;


		for(a=0;a<500;++a) {
			for(b=0;b<500;++b) {
				for(c=0;c<500;++c) {
					if((b*b)+(c*c)==a*a)
						System.out.println("A : "+a+" B : "+b+" C : "+c);
				}
			}
		}

	}

}
