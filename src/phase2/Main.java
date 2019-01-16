package phase2;

import java.util.*;

public class Main {
	static List<Rocket> rocketList = new ArrayList<>();
	
	public static void main(String[] args) {
		init();
		printRocketsInfo();
	}
	
	public static void init() {
		try {
			int i = 0;
			rocketList.add(new Rocket("32WESSDS"));
			rocketList.get(i).addTurbine(10);
			rocketList.get(i).addTurbine(30);
			rocketList.get(i).addTurbine(80);
			i++;
			rocketList.add(new Rocket("LDSFJA32"));
			rocketList.get(i).addTurbine(30);
			rocketList.get(i).addTurbine(40);
			rocketList.get(i).addTurbine(50);
			rocketList.get(i).addTurbine(50);
			rocketList.get(i).addTurbine(30);
			rocketList.get(i).addTurbine(10);
			i++;
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
