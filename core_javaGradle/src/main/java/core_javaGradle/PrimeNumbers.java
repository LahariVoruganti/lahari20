package core_javaGradle;

public class PrimeNumbers {

	public static void main(String[] args) {
		int num=5;
		boolean flag=false;
		for (int i=2; i<=num/2;i++) {
			if(num%i==0) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not a Prime Number");
		}

	}

}
