package unbrella;


//class unbrella :: We can define the attributes of the umbrella
//and some special functions here

//We can use different functions according to user needs, 
//and we can also use corresponding umbrellas for different weather
public class unbrella {
	
	
	public static  String[] size; //size attributes
	public static String color; //color attributes
	public static int power; // power attributes
	public static boolean Isopen; //state
	public static int handle_temperature; //temperature
	public static int wight;
	
	//Adjust_wight function
	public void Adjust_wight(int wei) {
		wight = wei;
		
	}
	
	//Adjust_color function
	public void Adjust_color(String co) {
		color = co;
	}
	//Adjust_handle_temperature function
	public void Adjust_handle_temperature(int te) {
		handle_temperature = te;
	}
}
