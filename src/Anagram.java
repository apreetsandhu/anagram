import java.util.Arrays;

/*
 * @author Anmolpreet Sandhu
 */


public class Anagram {

	public static boolean anagram(String[] a, String[] b) {
		
		int l1 = a.length;
		int l2 = b.length;
		
		
		//if length isn't equal strings can't be anagram
		if(l1 != l2) {
			return false;
		}
		else {
			
			//sort to compare
			Arrays.sort(a);
			Arrays.sort(b);
			
			//check if they have same characters
			for (int i = 0; i < l1;  i++)
			       if (a[i] != b[i])
			         return false;
			
		}
		return true; 
	}
	




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Just example, no need to hard code otherwis
		String[] s ={"a", "r","m","y"};
		String[] t ={"m","a","r","y"};
		if(anagram(s,t)) {
			System.out.println("Yes, Strings are anagram");
		}
		else
			System.out.println("No, Strings are not amagram");

	}

}
