import java.util.Scanner;

public class SumOfDigitsOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String num = sc.nextLine();
	    int sum = 0;
	    for(int i=0; i<num.length(); i++) {
	    	int a = Character.getNumericValue(num.charAt(i));
	    	sum += a;
	    }
	    System.out.println(sum);
	}
}
