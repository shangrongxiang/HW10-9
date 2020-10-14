package unbrella;
//In rainy days, if there is strong wind, the umbrella 
//will be fixed on top of our head and will not be damaged.
//The umbrella has an automatic drying function, 
//and the umbrella size can also be automatically adjusted
public class Rainumbrella extends unbrella{
	
	private boolean stableUmbrella;
	private boolean drying;
	private boolean windproof;
	
	
	
	
	
	public void powerAsumming() {
		
	}
	public void Adjuge_size(){
		System.out.println("The size automaticly changes to bige size");
		
	}

	public boolean isStableUmbrella() {
		return stableUmbrella;
	}

	public void setStableUmbrella(boolean stableUmbrella) {
		System.out.println("The stable umbrella function has been turned on");
		this.stableUmbrella = stableUmbrella;
	}

	public boolean isDrying() {
		return drying;
	}

	public void setDrying(boolean drying) {
		System.out.println("Drying function is turned on");
		this.drying = drying;
	}

	public boolean isWindproof() {
		return windproof;
	}

	public void setWindproof(boolean windproof) {
		System.out.println("Windproof function is turned on");
		this.windproof = windproof;
	}
	
}
