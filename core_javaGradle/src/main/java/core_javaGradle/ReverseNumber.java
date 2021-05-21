package core_javaGradle;

public class ReverseNumber {

	public static void main(String[] args) {
		int num= 123456, reversed= 0;
		while(num!=0) {
			int digit= num%10;
			reversed= reversed*10 + digit;
			num/=10;
		}
		System.out.println("The Reversed number is:" + reversed);
	}

}
