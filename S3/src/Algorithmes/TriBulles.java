package Algorithmes;

public class TriBulles {

	    static void tri_bulle(int[] tab)
	    {
	        int taille = tab.length;
	        int tmp = 0;
	        for(int i=0; i < taille; i++)
	        {
	            for(int j=1; j < (taille-i); j++)
	            {
	                if(tab[j-1] > tab[j])
	                {
	                    //echanges des elements
	                    tmp = tab[j-1];
	                    tab[j-1] = tab[j];
	                    tab[j] = tmp;
	                }

	            }
	        }
	    }
	    static void afficheTab(int[] tab)
	    {
	        for(int i=0; i < tab.length; i++)
	        {
	            System.out.print(tab[i] + " ");
	        }
	        System.out.println();
	    }
	    

	    public static void main(String[] args)
	    {

	        int[] arr = new int[10];
	        for (int i=0; i<10; i++){
	            int n = (int)(Math.random()*99 + 1);
	            arr[i] = n;
	        }


	        System.out.println("Avant le tri a bulle");

	        afficheTab(arr);

	        // tri des elements de tableau avec le tri a bulle
	        tri_bulle(arr);

	        System.out.println("Apres le tri a bulle");

	        afficheTab(arr);
	    }



	}