import java.util.Scanner;
public class que_3 {
	public static int SumOddDigits(int number) {
		
		int lastDigit = 0;
		int oddDigitSum = 0;
		
		
		while(number!=0) {
			
			lastDigit = number%10;
			
			if(lastDigit % 2!= 0) {
				
				
				oddDigitSum += lastDigit;
			}
			
			number = number/10;
		}
		return oddDigitSum;
	}
	
	public static void main (String[] args) {
		
		int number = 0;
		int sumOfOddDigits = 0;
		
		Scanner scan = new Scanner(System.in);
		
		number = scan.nextInt();
		
		sumOfOddDigits = SumOddDigits(number);
		
		System.out.println(sumOfOddDigits);
		scan.close();
	}

}
