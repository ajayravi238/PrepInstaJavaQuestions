import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String num = sc.nextLine();
	    int length = num.length();
	    int sum = 0;
	    for(int i=0; i<num.length(); i++) {
	    	int a = Character.getNumericValue(num.charAt(i));
	    	double pow = Math.pow(a, length);
	    	sum += pow;
	    }
	    if(Integer.parseInt(num) == sum) {
	    	System.out.println(num + " is Amstrong");
	    }
	    else {
	    	System.out.println(num + " is not Amstrong");
	    }
	}
}
