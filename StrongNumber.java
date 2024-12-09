import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		while(temp!=0) {
			int last = temp%10;
			int fact = 1;
			for(int i=1; i<=last; i++) {
				fact = fact * i;
			}
			sum += fact;
			temp = temp/10;
		}
		if(num == sum) {
			System.out.println(num + " is a strong number");
		}
		else {
			System.out.println(num + " is not a strong number");
		}
	}

}
