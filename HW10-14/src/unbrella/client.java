package unbrella;

import java.util.Scanner;

public class client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many users do you have:");
		int numofuser = sc.nextInt();
		User user1 = new User();

		boolean ifout = user1.setOut();
		
		if (ifout == true) {
		user1.setNumOfUmbrellas(numofuser);
		user1.setColor();
		System.out.println("I will prepare "+ numofuser+"umbrellas");
		unbrella.setIsopen(true);
		int weaString = user1.setWeather();
		switch (weaString) {
		case 1:
			Rainumbrella  rainy = new Rainumbrella();
			
			rainy.setDrying(true);
			rainy.setStableUmbrella(true);
			rainy.setWindproof(true);
			rainy.powerAsumming();
			rainy.Adjuge_size();
			break;

		case 2:
			Sunumbrella sunumbrella = new Sunumbrella();
			sunumbrella.charge();
			sunumbrella.reduce_weight();
			sunumbrella.setFun(true);
			sunumbrella.setHumidify(true);
			sunumbrella.setSunProtection(true);
			break;
			
		case 3:
			
			Snowumbrella snowy = new Snowumbrella();
			snowy.Adjuge_size();
			snowy.setAutomaticSnowRemoval(true);
			snowy.setDrying(true);
			snowy.setHeating(true);
			snowy.setHandle_temperature(25);
			
			
			break;
		}
	
		}
		
		else {
			user1.setOut();
			unbrella.setIsopen(false);
		}
		System.err.println("Thanks for using the smart umbrella");
		
	
	}

}
