import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Test2

		Scanner scanner = new Scanner(System.in);
		int age, height;
		System.out.println("Enter your age: ");
		age = scanner.nextInt();

		if (age >= 10) {

			System.out.println("Enter your height(cm): ");
			height = scanner.nextInt();

			if (height < 150) {
				System.out.println("You are too short sorry...");
			} else if (height > 200) {
				System.out.println("You are too tall sorry...");
			} else {

				System.out.println("Enter your weight (kg): ");
				double weight = scanner.nextDouble();

				if (weight > 200.0) {
					System.out.println("Sorry, you are unable to ride the roller coaster");
				} else if (weight > 0 && weight <= 200.0) {
					System.out.println("Enjoy your ride!");
				} else {
					System.out.println("Error, number entered must be positive");
				}

			}
		} else {
			System.out.print("Sorry, you must be 10 or older to ride the roller coaster");
		}
	}

}
