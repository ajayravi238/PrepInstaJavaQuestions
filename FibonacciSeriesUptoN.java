import java.util.Scanner;

public class FibonacciSeriesUptoN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int first = 0, second = 1, fib = 0;
		System.out.print(first + " " + second + " ");
		for(int i=2; i<num; i++) {
			fib = first + second;
			System.out.print(fib + " ");
			first = second;
			second = fib;
		}
	}
}
