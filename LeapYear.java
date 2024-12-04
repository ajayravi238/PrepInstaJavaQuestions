import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    if(num%400==0) {
	    	System.out.println(num + " is leap year");
	    }
	    else if(num%4==0 && num%100!=0) {
	    	System.out.println(num + " is leap year");
	    }
	    else {
	    	System.out.println(num + " is not leap year	");
	    }
	}
}
