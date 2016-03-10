
public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private ChocolateBoiler singletonInstance;
	
	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}
	
	public static ChocolateBoiler getInstance () {
		if (singletonInstance == null) {
			singletonInstance = new ChocolateBoiler();
		}
		return singletonInstance;
	}
	
	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			// fill the boiler with a milk/chocolate mixture
		}
	}
	
	// rest of ChocolateBoiler code...
}
