import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double a = Math.sqrt(num);
		if(Math.floor(a) == Math.ceil(a)) {
			System.out.println(num + " is a perfect square");
		}
		else {
			System.out.println(num + " is not a perfect square");
		}
	}

}
