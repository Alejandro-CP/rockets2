package phase1;

import java.util.*;

public class Main {
	static List<Rocket> rocketList = new ArrayList<>();

	public static void main(String[] args) {
		init();
		printRocketsInfo();
	}
	
	public static void init() {
		try {
			rocketList.add(new Rocket("32WESSDS",3));
			rocketList.add(new Rocket("LDSFJA32",6));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void printRocketsInfo() {
		for(Rocket r : rocketList) {
			System.out.println(r.printRocketInfo());
		}
	}
}
