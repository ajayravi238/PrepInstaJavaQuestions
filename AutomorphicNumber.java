import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		long sq = num*num;
		String numstr = String.valueOf(num);
		int len = numstr.length();
		String sqstr = String.valueOf(sq);
		String res = sqstr.substring(sqstr.length()-len);
		if(numstr.equals(res)) {
			System.out.println(sq + " is a automorphic number");
		}
		else {
			System.out.println(sq + " is not a automorphic number");
		}
	}

}
