import java.util.Scanner;

public class SumOfNumbersInGivenRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int last = sc.nextInt();
		int sum = 0;
		for(int i=first; i<=last; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
