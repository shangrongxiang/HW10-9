package unbrella;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		
		//If the user is out, the user will be asked
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);//Use input function
		System.out.println("are you going out?\n"//Use \n transfer function
				+ "1.yes\n"
				+ "2.no\n");
		int juge = sc.nextInt();
		
		while (juge !=1 ) {//Use the while function
			System.out.println("are you going out?\n"
					+ "1.yes\n"
					+ "2.no\n");
			juge = sc.nextInt();
			System.out.println("if you want to go out Please tell me !");

		}
		System.out.println("What type of umbrella do you want to use:\n"
				+ "1.sunumbrella\n"
				+ "2.rainumbrella\n"
				+ "3.snowumbrella\n");
		int item;
		item = sc.nextInt();
		switch (item) { //Use switch selection function
		//Users can choose from three umbrellas to facilitate
		//the use of different weather
		case 1:
			Sunumbrella sun = new Sunumbrella();//Define a new umbrella
			//Users can choose their own colors
			System.out.println("Please enter the umbrella color you want to use:");
			unbrella.color = sc.next();
			unbrella.handle_temperature = 18;
			unbrella.Isopen = true;
			//Umbrella plays its own corresponding function
			sun.charge();
			sun.fun();
			sun.humidify();
			sun.Sun_protection();
			sun.reduce_weight();
			break;//We jump out of the selection after using it once, 
			//so we have to use break
		case 2:
			Rainumbrella rain = new Rainumbrella();//Define a new umbrella
			//Users can choose their own colors
			System.out.println("Please enter the umbrella color you want to use:");
			unbrella.color = sc.next();
			unbrella.Isopen = true;
			//Umbrella plays its own corresponding function
			rain.Adjuge_size();
			rain.drying();
			rain.Windproof();
			
			break;//We jump out of the selection after using it once, 
			//so we have to use break
		case 3:
			Snowumbrella snow = new Snowumbrella();//Define a new umbrella
			//Users can choose their own colors
			System.out.println("Please enter the umbrella color you want to use:");
			unbrella.color = sc.next();
			unbrella.Isopen = true;
			//Umbrella plays its own corresponding function
			snow.heating();
			snow.drying();
			snow.Automatic_snow_removal();
			snow.Adjuge_size();
			break;//We jump out of the selection after using it once, 
			//so we have to use break
		
		}
		
	}

}
