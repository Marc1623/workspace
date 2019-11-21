
public class RecursionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n = 3 ;
		int []v = {7,6,10,11};
		
		System.out.println("Bella Ciao !");
		//System.out.println(sum(n));
		//System.out.println(sumRecu(n));
		//System.out.println(gauss(n));
		//System.out.println(sommeVecteur(v));
		System.out.println(sommeVecteurRecu(v, v.length));
	}
	
	public static int sommeVecteurRecu (int []v, int dim) {
		//clause de finitude
		if (dim== 0) {
			return 0;
		}
		if(dim ==1) {
			return v[dim-1];
		}
		//pas récursif
		return v[dim-1]+sommeVecteurRecu(v,dim-1);
	}
	
	
	
	public static int sommeVecteur (int[] v) {
		int somme=0;
		for(int i=0; i<v.length;i++) {
			somme += v[i];
		}
		return somme;
	}
	
	
	public static int gauss (int n) {
		
		return (n+1)*n/2;
	}
	
	public static int sumRecu(int n) {
		//clause de finitude
		if(n<=0) {
			return 1;
		}
		//pas récursif
		return n +sumRecu(n-1);
	}
	
	
	
	public static int sum(int n) {
		int sum=0;
		
		for(int i=0; i<n; i++) {
			sum+=i;
		}
		return sum;
	}

}
