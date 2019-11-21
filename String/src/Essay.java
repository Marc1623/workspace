
public class Essay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] tab1 = {1,2,3};
		int[] tab2 = {1,2,3};
		
		System.out.print(same(tab1,tab2));
		
		

	}
	
	public static boolean same (int []v1, int []v2){
		
		
		if(v1.length != v2.length){
			return false;
		}
		
		for(int i=0; i < v1.length; i++){
			 if(v1[i] != v2[i])
				 return false;
		 }
		 return true;
		
	}

}
