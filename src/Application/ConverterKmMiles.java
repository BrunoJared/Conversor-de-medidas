/*
 * This program convert Miles to kilometers
 */
package Application;

import java.util.Locale;
import java.util.Scanner;

public class ConverterKmMiles {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Enter the value in Miles: ");
			double Km = scan.nextDouble();
			
			double results = (int) (Km / 0.621371);
			
			System.out.println("Value in kilometers is: " + results);
		}
		
		

	}

}
