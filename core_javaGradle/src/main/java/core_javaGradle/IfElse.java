package core_javaGradle;

public class IfElse {

	public static void main(String[] args) {
		int marks = 50;
		if(marks>65) {
			System.out.println("First Grade");	
		}
		else {
			if(marks>45 && marks<65) {
				System.out.println("Second Grade");
			}
			else {
				if(marks>33 && marks <45) {
					System.out.println("Third Grade");
				}
				else {
					System.out.println("Fail");
				}
			}
		}

	}

}
