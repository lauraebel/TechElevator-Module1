package com.techelevator;

public class TriangleClassifier {
	
	public String classify(int sideOne, int sideTwo, int sideThree) {
		if(sideOne == sideTwo && sideOne == sideThree) {
			return "equilateral";
		}
		if(sideOne != sideTwo && sideTwo != sideThree && sideOne != sideThree) {
			return "scalene";
		}
		
		
		
		return null;
	}
	
	
	
	
	

}