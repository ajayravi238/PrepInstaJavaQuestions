import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int pow = sc.nextInt();
		int res = base;
		for(int i=1; i<pow; i++) {
			res = base * res;
		}
		System.out.println(res);
	}

}
