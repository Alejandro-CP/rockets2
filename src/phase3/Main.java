package phase3;

import java.util.*;

public class Main {
	static List<Rocket> rocketList = new ArrayList<>();
	
	public static void main(String[] args) {
		init();
		printRocketsInfo();
		printRocketsSpeed();
		step4();
		printRocketsSpeed();
		step6();
		printRocketsSpeed();
		step8();
		printRocketsSpeed();
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
	
	public static void printRocketsSpeed() {
		for(Rocket r : rocketList) {
			System.out.println(r.printSpeed());
		}
	}
	
	public static void accelerateXTimes(String code, int x) {
		for(Rocket r : rocketList) {
			if(r.getCode().equals(code)) {
				for(int i = 0; i < x; i++) {
					r.accelerate();
				}
			}
		}
		System.out.println("El coet amd codi \"" + code + "\" accelera " + x + " vegades.");
	}
	
	public static void brakeXTimes(String code, int x) {
		for(Rocket r : rocketList) {
			if(r.getCode().equals(code)) {
				for(int i = 0; i < x; i++) {
					r.brake();
				}
			}
		}
		System.out.println("El coet amd codi \"" + code + "\" frena " + x + " vegades.");
	}
	
	public static void step4() {
		accelerateXTimes("32WESSDS", 3);
		accelerateXTimes("LDSFJA32", 3);
	}
	public static void step6() {
		brakeXTimes("32WESSDS", 5);
		accelerateXTimes("LDSFJA32", 7);
	}
	public static void step8() {
		accelerateXTimes("32WESSDS", 15);
		accelerateXTimes("LDSFJA32", 15);
	}
}
