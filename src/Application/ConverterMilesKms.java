/*
 * This program convert kilometers  to Miles
 */
package Application;

import java.util.Locale;
import java.util.Scanner;

public class ConverterMilesKms {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			double KM;
			double Mile;

			System.out.print("Type value in Kilometer : ");
			KM = sc.nextDouble();

			Mile = (KM / 1.6);

			System.out.println("In Mile is : " + Mile);
		}
	}

}
