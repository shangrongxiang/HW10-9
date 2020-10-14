package unbrella;


//I defined a subclass, which inherits the characteristics of the umbrella, 
//and has its own unique attributes and functions,
//which can provide better services when the pup users use the umbrella
public class Sunumbrella extends unbrella{
	
	//It should be that the size of the sun umbrella is not too big, so we set it to a medium size
	public static void adjuge_size() {
		size[0] = "medium size";
		System.out.println("The size automaticly chenges to medium size");
	}

//Summer is the season where sun umbrellas are used 
//more frequently. We can turn on the fan for humidification,
//sunscreen and weight loss to avoid the heat
	
	public void fun(){
		power = power - 10;
		System.out.println("Turn on the fun");
	}
	public void humidify() {
		System.out.println("Turn on humidification");
	}
	
	public void Sun_protection() {
		System.out.println("Sun protection function turned on");	
	}
	
	public void reduce_weight(){
		System.out.println("Weight reduce!");
	}


	public void charge() {
		power = 100;
		
	}
}
