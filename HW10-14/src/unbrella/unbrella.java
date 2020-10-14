package unbrella;


//class unbrella :: We can define the attributes of the umbrella
//and some special functions here

//We can use different functions according to user needs, 
//and we can also use corresponding umbrellas for different weather
public class unbrella {
	
	
	private static  int size; //size attributes
	private static String color; //color attributes
	private static int power; // power attributes
	private static boolean Isopen; //state
	private static int handle_temperature; //temperature
	private static int wight;


	public static int getWight() {
		return wight;
	}

	public static void setWight(int wight) {
		unbrella.wight = wight;
	}

	public static int getHandle_temperature() {
		return handle_temperature;
	}

	public static void setHandle_temperature(int handle_temperature) {
		unbrella.handle_temperature = handle_temperature;
	}

	public static boolean isIsopen() {
		return Isopen;
	}

	public static void setIsopen(boolean isopen) {
		Isopen = isopen;
	}



	public static String getColor() {
		return color;
	}

	public static void setColor(String color) {
		unbrella.color = color;
	}

	public static int getSize() {
		return size;
	}

	public static void setSize(int size) {
		unbrella.size = size;
	}

	/**
	 * @return the power
	 */
	public static int getPower() {
		return power;
	}

	/**
	 * @param power the power to set
	 */
	public void setPower(int power) {
		unbrella.power = power;
	}
}
