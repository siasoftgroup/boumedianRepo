package siasoft.module1;

import java.util.Scanner;


/**
 * @author Boussaid
 *
 */
public class Test {

	/**
	 * Method permet de faire ....
	 * 
	 * @return boolean si égale à 50
	 */
	public void verifierCode() {

		
		Scanner sc = new Scanner(System.in);
		 System.out.println("Saisissez un chiffre a verifier : ");
		    int i = sc.nextInt();
		    System.out.println("liste de nombre pair inclu ");
		for (int j = 1; j < i; j++) {
			if (j % 2 == 0) {
				System.out.println( j + ",");

			} 
		}

	}

}
