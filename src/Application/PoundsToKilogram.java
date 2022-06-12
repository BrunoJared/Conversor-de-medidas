/*
 * This program convert pounds to kilogram
 */
package Application;

import java.util.Locale;
import java.util.Scanner;

public class PoundsToKilogram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Enter the value in Pounds: ");
			double pound = scan.nextDouble();

			double results = (int) (pound / 2.205);

			System.out.println("Value in kilograms is: " + results);
		}
	}
}
