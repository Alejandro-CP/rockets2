package phase1;

public class Rocket {
	private static final int codeLength = 8;
	private String code;
	private int turbineQuant;
	
	public Rocket(String name, int turbines) throws Exception{
		if(name.equals("")||(name.length() != codeLength)) throw new Exception("El codi del coet ha de tenir " + codeLength + " car�cters.");
		if(turbines < 1) throw new Exception ("El coet ha de tenir com a m�nim un propulsor.");
		code = name;
		turbineQuant = turbines;
	}
	
	public String getCode() {
		return code;
	}
	public int getNumberOfTurbines() {
		return turbineQuant;
	}
	public String printRocketInfo() {
		return "El coet amb codi \"" + code + "\" t� " + turbineQuant + " propulsors.";
	}
}
