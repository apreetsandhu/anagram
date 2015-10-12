import java.util.Arrays;

public class Anagram {

	public static boolean anagram(String[] a) {
	
		Arrays.sort(a);
		
		return true; 
	}
	




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] s ={"a", "r","s","b","c"};
		String[] t ={"r","m","l","s","c"};
		if(anagram(s) == anagram(t)) {
			System.out.println("Yo!");
		}
		else
			System.out.println("Nope!");

	}

}
