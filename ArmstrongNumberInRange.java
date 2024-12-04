import java.util.Scanner;

public class ArmstrongNumberInRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int last = sc.nextInt();
		for(int i=first; i<last; i++) {
			String num = String.valueOf(i);
		    int length = num.length();
		    int sum = 0;
		    for(int j=0; j<num.length(); j++) {
		    	int a = Character.getNumericValue(num.charAt(j));
		    	double pow = Math.pow(a, length);
		    	sum += pow;
		    }
		    if(Integer.parseInt(num) == sum) {
		    	System.out.println(num + " is Amstrong");
		    }
		}
	}
}
