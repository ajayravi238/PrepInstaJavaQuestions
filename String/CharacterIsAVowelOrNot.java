import java.util.Scanner;

public class CharacterIsAVowelOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.toLowerCase();
		char ch = str.charAt(0);
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println(ch + " is Vowel");
		}
		else {
			System.out.println(ch + " is not a Vowel");
		}
	}
}
