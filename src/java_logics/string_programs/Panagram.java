package java_logics.string_programs;

public class Panagram {

	public static void main(String[] args) {
		String str = "poi&&uy%trewq_*_asd%^fghjkl!@@mnbv?<>CXz";
		String s = str.replaceAll("[^a-zA-Z]", "");
		String s1 = s.toLowerCase();
		if(s1.length() == 26)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not a Anagram");
		}
	}
}
