import java.util.Scanner;

public class LengthOfStringWIthoutFunction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int length = 0;
		for(int i : str.toCharArray()) {
			length++;
		}
		System.out.println(length);
	}

}
