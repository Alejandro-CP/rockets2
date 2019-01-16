package phase3;

public class Turbine {
	private final int maxPower;
	private int realPower;
	private static final int stepPower = 10;
	
	// Constructors
	public Turbine(int maxPower) throws Exception{
		if(maxPower <= 0) throw new Exception ("La potència màxima d'un propulsor ha de ser major a 0.");
		this.maxPower = maxPower;
		realPower = 0;
	}
	
	// Getters
	public int getMaxPower() {
		return maxPower;
	}
	public int getRealPower() {
		return realPower;
	}
	
	// Public methods
	public void addPower() {
		realPower += stepPower;
		if(realPower > maxPower) {
			realPower = maxPower;
		}
	}
	public void reducePower() {
		realPower -= stepPower;
		if(realPower < 0) {
			realPower = 0;
		}
	}
}
