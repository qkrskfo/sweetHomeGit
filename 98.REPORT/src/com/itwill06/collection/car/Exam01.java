package com.itwill06.collection.car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Exam01 {
	
	private HashMap<String,Car> carMap;
	private int count;// 주차장 구획수

	public Exam01() {
		carMap = new HashMap<String,Car>();
		count = 30;
	}

	public Exam01(int count) {
		carMap = new HashMap<String,Car>();
		this.count = count;
	}
	
	public ArrayList<Car> findByInTime(int inTime){
		ArrayList<Car> findCars = new ArrayList<Car>();
		
		Iterator<String> carNoIterator= carMap.keySet().iterator();
		while(carNoIterator.hasNext()) {
			String carNo = carNoIterator.next();
			Car tempCar = carMap.get(carNo);
			if(tempCar.getInTime() >= inTime) {
				findCars.add(tempCar);
			}
		}
		
		return findCars;
	}
	
	
}