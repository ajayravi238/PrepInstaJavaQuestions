import java.util.Scanner;

public class CheckChIsAbphabetOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch = str.charAt(0);
		if(str.length() == 1) {
			if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				System.out.println(ch + " is Alphabet");
			}
			else {
				System.out.println(ch + " not an Alphabet");
			}
		}
		else {
			System.out.println(str + " not an Alphabet");
		}
	}
}
