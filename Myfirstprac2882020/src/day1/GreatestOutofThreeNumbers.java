package day1;

public class GreatestOutofThreeNumbers {

	public static void main(String[] args) {

		int firstNumber = 92;
		int secondNumber = 93;
		int thirdNumber = 90;

		if ((firstNumber > secondNumber) && (firstNumber > thirdNumber)) {

			System.out.println("firstNumber is greatest");
			
		} else if (secondNumber > firstNumber && secondNumber > thirdNumber) {

			System.out.println("secondNumber is greatest");
			
		} else if ((thirdNumber > firstNumber) && (thirdNumber > secondNumber)) {
			
			System.out.println("thirdNumber is greatest");

		}
		
	}
		
	
}