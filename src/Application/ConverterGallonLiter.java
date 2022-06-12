/*
 * This program convert gallon  to liter
 */
package Application;

import java.util.Locale;
import java.util.Scanner;

	public class ConverterGallonLiter {



	    public static void main(String []args){
	    	Locale.setDefault(Locale.US);
	        try (Scanner sc = new Scanner(System.in)) {
				double gallon;
				double liters;


				System.out.print("Enter quantity of gallons : ");
				gallon = sc.nextDouble();
				liters = (gallon*3.7854);

				System.out.println(gallon+ " gallons = "+liters+ " liters");
			}


	    }

}
