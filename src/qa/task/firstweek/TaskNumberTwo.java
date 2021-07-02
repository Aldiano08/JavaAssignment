package qa.task.firstweek;

import java.util.Scanner; // Input scanner class in java program

public class TaskNumberTwo {

	public static void main(String args[]) {

		System.out.println("Task First Week");

		Scanner input;
		// used variables
		float x, y, result;
		char operators;

		input = new Scanner(System.in);
		System.out.print("Value x = ");
		x = input.nextFloat();

		System.out.print("operators = ");
		operators = input.next().charAt(0);

		System.out.print("value y = ");
		y = input.nextFloat();

		System.out.println("Proses = " + x + " " + operators + " " + y);

		// if statement

		if (operators == '+') {
			result = x + y;
			// (+)
			System.out.print(" result = " + result);

		} else if (operators == '-') {
			result = x - y;
			// (-)
			System.out.print(" result = " + result);

		} else if (operators == '*') {
			result = x * y;
			// (*)
			System.out.print(" result = " + result);

		} else if (operators == '/') {

			// (/)
			if ((y == 0)) {
				System.out.print("Infinite");
			} else {
				result = x / y;
				System.out.print(" result = " + result);
			}

		} else {
			System.out.print("Error");
		}

	}

}
