import java.util.Scanner;

public class FriendlyPair {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum1 = 0, sum2 = 0;
		for(int i=1; i<num1; i++) {
			if(num1%i == 0) {
				sum1 += i;
			}
		}
		for(int i=1; i<num2; i++) {
			if(num2%i == 0) {
				sum2 += i;
			}
		}
		if((sum1/num1) == (sum2/num2)) {
			System.out.println(num1 + " and " + num2 + " are friendly numbers");
		}
		else {
			System.out.println(num1 + " and " + num2 + " are not a friendly numbers");
		}
	}

}
