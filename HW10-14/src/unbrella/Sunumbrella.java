package unbrella;


//I defined a subclass, which inherits the characteristics of the umbrella, 
//and has its own unique attributes and functions,
//which can provide better services when the pup users use the umbrella
public class Sunumbrella extends unbrella{
	
	private boolean fun;
	private boolean humidify;
	private boolean sunProtection;
	

	
	//It should be that the size of the sun umbrella is not too big, so we set it to a medium size
	public static void adjuge_size() {
	
		System.out.println("The size automaticly chenges to medium size");
	}

//Summer is the season where sun umbrellas are used 
//more frequently. We can turn on the fan for humidification,
//sunscreen and weight loss to avoid the heat
	
	
	public void reduce_weight(){
		System.out.println("Weight reduce!");
	}


	public void charge() {
		System.err.println("Automatic charging function is turned on");
		setPower(100);
		
	}

	public boolean isFun() {
		
		return fun;
	}

	public void setFun(boolean fun) {
		System.err.println("Fun function is turned on");
		this.fun = fun;
	}

	public boolean isHumidify() {
		return humidify;
	}

	public void setHumidify(boolean humidify) {
		System.out.println("Humidify function is turned on");
		this.humidify = humidify;
	}

	public boolean isSunProtection() {
		return sunProtection;
	}

	public void setSunProtection(boolean sunProtection) {
		System.out.println("Sun protection function is turned on");
		this.sunProtection = sunProtection;
	}

	/**
	 * @param power the power to set
	 */
}
