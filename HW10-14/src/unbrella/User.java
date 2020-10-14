package unbrella;

import java.util.Scanner;

public class User {
	

	private int numOfUmbrellas;
	private boolean out;
	private String getweather;
	private String color;
	

	/**
	 * @return the numOfUmbrellas
	 */
	public int getNumOfUmbrellas() {
		return numOfUmbrellas;
	}

	/**
	 * @param numOfUmbrellas the numOfUmbrellas to set
	 */
	public void setNumOfUmbrellas(int numOfUmbrellas) {
		if (numOfUmbrellas>0){
		this.numOfUmbrellas = numOfUmbrellas;}
		else {
			this.numOfUmbrellas = 1;
		
		}
	}

	/**
	 * @return the out
	 */


	/**
	 * @param out the out to set
	 */
	public boolean setOut() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you going go out?:(y/n) ");
		String outString = sc.next();
		if (outString == "y") {
			this.out = true;
		
		}
		else if (outString == "Y") {
			this.out = true;
			
		}
		else {
			this.out = false;
			
		}
		return true;
	}

	/**
	 * @return the weather
	 */
	public String getWeather() {
		return getweather;
	}

	/**
	 * @param weather the weather to set
	 */
	public int setWeather() {
		String[] weather = new String[3];
		weather[0] = "Rainy";
		weather[1] = "Sunny";
		weather[2] = "Snowy";
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please cheack today weather: "
				+ "\n1.Rainy"
				+ "\n2.Sunny"
				+ "\n3.Snowy");
		int cas = scanner.nextInt();
		switch (cas) {
		case 1:
			this.getweather = weather[0];
			break;
		

		case 2:
			this.getweather = weather[1];
			break;

		case 3:
			this.getweather = weather[2];
			break;
			
		}
		return cas;
		
		
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor() {
		
		String[] colorStrings = new String[7];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the umbrella color you want to use:"
				+ "\n1.red"
				+ "\n2.yellow"
				+ "\n3.blue"
				+ "\n4.pink"
				+ "\n5.black"
				+ "\n6.orange"
				+ "\n7.others");
		int ca = scanner.nextInt();
		switch (ca) {
		case 1:
			this.color = "red";
			break;

		case 2:
			this.color = "yellow";
			
			break;
		
		case 3:
			this.color = "blue";
			break;
		case 4:
			this.color = "pink";
			break;
		case 5:
			this.color = "black";
			break;
		case 6:
			this.color = "orange";
			break;
		case 7:
			System.out.println("Please enter the umbrella coloe you want to use: ");
			this.color = scanner.next();
		}

		
	}

	


}
