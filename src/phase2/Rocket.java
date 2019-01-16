package phase2;

import java.util.*;

public class Rocket {
	private static final int codeLength = 8;
	private String code;
	private List<Turbine> turbineList = new ArrayList<>();
	
	// Constructors
	public Rocket(String name) throws Exception{
		if(name.equals("")||(name.length() != codeLength)) throw new Exception("El codi del coet ha de ser de " + codeLength + " caràcters.");
		code = name;
	}
	
	// Getters
	public String getCode() {
		return code;
	}
	public int getNumberOfTurbines() {
		return turbineList.size();
	}
	
	// Public Methods
	public String printRocketInfo() {
		return "El coet amb codi \"" + code + "\" té " + turbineList.size() + " propulsors, amb potències màximes de: " + getTurbinesPower() +".";
	}
	public void addTurbine(int power) throws Exception{
		turbineList.add(new Turbine(power));
	}
	
	// Private Methods
	private String getTurbinesPower() {
		StringBuilder result = new StringBuilder(Integer.toString(turbineList.get(0).getMaxPower()));
		for(int i = 1; i < turbineList.size(); i++) {
			result.append(", " + turbineList.get(i).getMaxPower());
		}
		return result.toString();
	}
}

