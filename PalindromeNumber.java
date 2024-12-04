import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int num = n;
	    int reverse = 0, rem = 0;
	    while(num != 0) {
	    	rem = num%10;
	    	reverse = reverse * 10 + rem;
	    	num = num / 10;
	    }
	    if(n == reverse) {
	    	System.out.println(n + " is palindrome");
	    }
	    else {
	    	System.out.println(n + " is not palindrome");
	    }
	}
}
