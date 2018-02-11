package siasoft.module1;

import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author Boussaid
 *
 */
public class main {

	/**
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//verifier nombre pair 
		test t = new test();
		t.verifierCode();
		System.out.println("*********************************************");
		automobile auto = new automobile("wolswaguen", "rouge", 320);
		System.out.println("*********************************************");
		auto.toString();
		System.out.println("*********************************************");
		/* instanciation */
		filtre f = new filtre(" fiat", "bleu", 220, "ga620", "m605", "z213");
		System.out.println("*********************************************");
		/* surcharge */
		System.out.println(f.affiche());
		System.out.println(f.affiche(" misfat"));
		System.out.println("*********************************************");
		/* recuperation des donnees apartir de BD */
		f.user();
		//insertion des donnees dans la base.
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez nom client : ");
		String nom = sc.nextLine();
		System.out.println("Saisissez adresse client : ");
		String adr = sc.nextLine();
		System.out.println("Saisissez numero de telephone client : ");
		int tel = sc.nextInt();
		f.ajoutuser(nom, adr, tel);
	}

}
