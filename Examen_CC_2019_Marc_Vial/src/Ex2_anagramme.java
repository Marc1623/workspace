import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Collections;
	import java.util.List;
	import java.util.Scanner;
	
public class Ex2_anagramme {
	
	Scanner scanner = new Scanner(System.in);
	static boolean check = false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		 
		System.out.println("Quel est le premier mot que vous souhaitez prendre en paramètre?");
		String s1 = scanner.nextLine();
		System.out.println("Quel est le deuxième mot que vous souhaitez prendre en paramètre?");
		String s2 = scanner.nextLine();
		System.out.println(anagrameRecursifEx3(s1, s2));
		
		/*
		String ch1 = "aacd";
		String ch2 = "dcaa";
		int []stat = new int [256];
		
		for (int i=0 ; i<256 ; i++)
			System.out.println(i + ": " +(char)i);
		
	
		System.out.println(estAnagrame(ch1,ch2));
		*/
		
		

	}
	
	
	public static boolean anagrameRecursifEx3(String s1, String s2) {
			s1 = s1.toLowerCase();
			s2 = s2.toLowerCase();
			if (s1.length() == s2.length()) {
				if (s1.length() == 1) {
					if ((s1).compareTo(s2) == 0) {
						check= true;
					}
				} else {
					// trie par ordre croissant s1 et s2
					char[] lettres1 = s1.toCharArray();
					Arrays.sort(lettres1);
					s1="";
					for(int k = 0; k < s1.length(); k ++) {
						s1+=String.valueOf(lettres1[k]);
					}
					char[] lettres2 = s2.toCharArray();
					Arrays.sort(lettres2);
					s2="";
					for(int k = 0; k < s2.length(); k ++) {
						s2+=String.valueOf(lettres2[k]);
					}
					if (s1.charAt(0) == (s2.charAt(0))) {
						s1 = s1.replace(String.valueOf(s1.charAt(0)), "");
						s2 = s2.replace(String.valueOf(s2.charAt(0)), "");
						anagrameRecursifEx3(s1, s2);
					}
				}
			}
			return check;
		}
	
	

		
	
	public static boolean estAnagrame(String ch1, String ch2){

		if (ch1.length()!=ch2.length())
			return false;
		
		int []stat = new int [256];
		
		for (int i=0; i< ch1.length(); i++){
			char c = ch1.charAt(i);
			stat[c]++;
		}
			
		for (int i=0; i< ch2.length(); i++){
			char c = ch2.charAt(i);
			stat[c]--;
		}
		
		for (int i=0; i<stat.length; i++)
			if (stat[i] != 0)
				return false;
		
		
		return true;
	}

}

	
