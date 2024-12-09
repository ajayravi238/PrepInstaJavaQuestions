import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		int temp = num;
		while(temp!=0) {
			int rem = temp%10;
			sum += rem;
			temp = temp/10;
		}
		if(num%sum == 0) {
			System.out.println(num + " is harshad number");
		}
		else {
			System.out.println(num + " is not harshad number");
		}
	}

}
