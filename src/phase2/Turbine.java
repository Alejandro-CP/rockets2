package phase2;

public class Turbine {
	private final int maxPower;
	
	// Constructors
	public Turbine(int maxPower) throws Exception{
		if(maxPower <= 0) throw new Exception ("La pot�ncia m�xima d'un propulsor ha de ser major a 0.");
		this.maxPower = maxPower;
	}
	
	// Getters
	public int getMaxPower() {
		return maxPower;
	}
}
