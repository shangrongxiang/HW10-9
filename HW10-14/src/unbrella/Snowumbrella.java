package unbrella;

//When it snows in winter, when using an umbrella, //
//the user will be very cold, so three have the function //
//of automatic heating and removing the snow on the umbrella top, //
//which can make us warm and walk outdoors in winter more convenient
public class Snowumbrella extends unbrella{
	private boolean drying;
	private boolean heating;
	private boolean automaticSnowRemoval;
	

	public void Adjuge_size(){
		
		System.out.println("The size automaticly changes to suitable size");
	}


	/**
	 * @return the drying
	 */
	public boolean isDrying() {
		return drying;
	}


	/**
	 * @param drying the drying to set
	 */
	public void setDrying(boolean drying) {
		System.out.println("Automatic drying function is turned on");
		this.drying = drying;
	}


	/**
	 * @return the heating
	 */
	public boolean isHeating() {
		return heating;
	}


	/**
	 * @param heating the heating to set
	 */
	public void setHeating(boolean heating) {
		System.out.println("Automatic heating function is turned on");
		this.heating = heating;
	}


	/**
	 * @return the automaticSnowRemoval
	 */
	public boolean isAutomaticSnowRemoval() {
		return automaticSnowRemoval;
	}


	/**
	 * @param automaticSnowRemoval the automaticSnowRemoval to set
	 */
	public void setAutomaticSnowRemoval(boolean automaticSnowRemoval) {
		System.out.println("Automatic Snow Removal function is turned on");
		this.automaticSnowRemoval = automaticSnowRemoval;
	}

}
	
