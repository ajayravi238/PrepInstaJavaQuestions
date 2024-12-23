import java.util.Scanner;

public class ASCIIValueOfChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch = str.charAt(0);
		System.out.println((int)ch);
	}
}
