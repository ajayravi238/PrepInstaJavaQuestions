import java.util.Scanner;

public class RemoveCharExceptAlphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		for(int i=0; i<str.length(); i++) {
			if((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				continue;
			}
			else {
				System.out.print(str.charAt(i));
			}
		}
	}
}
