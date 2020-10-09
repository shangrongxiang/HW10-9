package unbrella;

//When it snows in winter, when using an umbrella, //
//the user will be very cold, so three have the function //
//of automatic heating and removing the snow on the umbrella top, //
//which can make us warm and walk outdoors in winter more convenient
public class Snowumbrella extends unbrella{
	public void drying() {
		System.out.println("Drying Turn on");
		
	}
	
	public void Adjuge_size(){
		size[2] = "big_size";
		System.out.println("The size automaticly changes to suitable size");
	}
	
	public void heating() {
		System.err.println("Hearting system turn on");
	}
	
	public void Automatic_snow_removal() {
		System.out.println("Automatic snow removal trun on");
		
	}
}
	
