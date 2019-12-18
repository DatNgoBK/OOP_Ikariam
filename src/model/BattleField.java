package model;

import model.House;

public class BattleField {
	
	private int numberOfSlotForHI;
	private int numberOfSlotForLRF;
	private int numberOfSlotForLI;
	private int numberOfSlotForAr;
	private int numberOfSlotForBB;
	private int numberOfSlotForGy;
	
	private int spacePerSlotForHI;
	private int spacePerSlotForLRF;
	private int spacePerSlotForLI;
	private int spacePerSlotForAr;
	private int spacePerSlotForBB;
	private int spacePerSlotForGy;
	
	
	
	
	
	
	public int getNumberOfSlotForGy() {
		return numberOfSlotForGy;
	}
	public void setNumberOfSlotForGy(int numberOfSlotForGy) {
		this.numberOfSlotForGy = numberOfSlotForGy;
	}
	public int getNumberOfSlotForHI() {
		return numberOfSlotForHI;
	}
	public void setNumberOfSlotForHI(int numberOfSlotForHI) {
		this.numberOfSlotForHI = numberOfSlotForHI;
	}
	public int getnumberOfSlotForLRF() {
		return numberOfSlotForLRF;
	}
	public void setnumberOfSlotForLRF(int numberOfSlotForLRF) {
		this.numberOfSlotForLRF = numberOfSlotForLRF;
	}
	public int getNumberOfSlotForLI() {
		return numberOfSlotForLI;
	}
	public void setNumberOfSlotForLI(int numberOfSlotForLI) {
		this.numberOfSlotForLI = numberOfSlotForLI;
	}
	public int getnumberOfSlotForAr() {
		return numberOfSlotForAr;
	}
	public void setnumberOfSlotForAr(int numberOfSlotForAr) {
		this.numberOfSlotForAr = numberOfSlotForAr;
	}
	public int getnumberOfSlotForBB() {
		return numberOfSlotForBB;
	}
	public void setnumberOfSlotForBB(int numberOfSlotForBB) {
		this.numberOfSlotForBB = numberOfSlotForBB;
	}
	
	public void setBattleField(House house) {
		
		if(house.getLevelOfHouse() >= 1 && house.getLevelOfHouse() <=4) {
			this.numberOfSlotForHI = 3;
			this.numberOfSlotForLI = 0;
			this.numberOfSlotForAr = 1;
			this.numberOfSlotForBB = 1;
			this.numberOfSlotForLRF = 3;
			this.numberOfSlotForGy = 1;
			
			this.spacePerSlotForHI = 30;
			this.spacePerSlotForLI = 30;
			this.spacePerSlotForAr = 6;
			this.spacePerSlotForBB = 10;
			this.spacePerSlotForLRF = 30;
			this.spacePerSlotForGy = 10;
		}
		if(house.getLevelOfHouse() >= 5 && house.getLevelOfHouse() <=9) {
			this.numberOfSlotForHI = 5;
			this.numberOfSlotForLI = 2;
			this.numberOfSlotForAr = 2;
			this.numberOfSlotForBB = 1;
			this.numberOfSlotForLRF = 5;
			this.numberOfSlotForGy = 1;
			
			this.spacePerSlotForHI = 30;
			this.spacePerSlotForLI = 30;
			this.spacePerSlotForAr = 6;
			this.spacePerSlotForBB = 20;
			this.spacePerSlotForLRF = 30;
			this.spacePerSlotForGy = 20;
		}
		if(house.getLevelOfHouse() >= 10 && house.getLevelOfHouse() <= 16) {
			this.numberOfSlotForHI = 7;
			this.numberOfSlotForLI = 4;
			this.numberOfSlotForAr = 3;
			this.numberOfSlotForBB = 1;
			this.numberOfSlotForLRF = 7;
			this.numberOfSlotForGy = 1;
			
			this.spacePerSlotForHI = 30;
			this.spacePerSlotForLI = 30;
			this.spacePerSlotForAr = 6;
			this.spacePerSlotForBB = 30;
			this.spacePerSlotForLRF = 30;
			this.spacePerSlotForGy = 30;
		}
		if(house.getLevelOfHouse() >= 17 && house.getLevelOfHouse() <= 24) {
			this.numberOfSlotForHI = 7;
			this.numberOfSlotForLI = 6;
			this.numberOfSlotForAr = 4;
			this.numberOfSlotForBB = 2;
			this.numberOfSlotForLRF = 7;
			this.numberOfSlotForGy = 2;
			
			this.spacePerSlotForHI = 40;
			this.spacePerSlotForLI = 30;
			this.spacePerSlotForAr = 6;
			this.spacePerSlotForBB = 20;
			this.spacePerSlotForLRF = 40;
			this.spacePerSlotForGy = 20;
		}
		if(house.getLevelOfHouse() >= 25) {
			this.numberOfSlotForHI = 7;
			this.numberOfSlotForLI = 6;
			this.numberOfSlotForAr = 5;
			this.numberOfSlotForBB = 2;
			this.numberOfSlotForLRF = 7;
			this.numberOfSlotForGy = 2;

			this.spacePerSlotForHI = 50;
			this.spacePerSlotForLI = 40;
			this.spacePerSlotForAr = 6;
			this.spacePerSlotForBB = 30;
			this.spacePerSlotForLRF = 50;
			this.spacePerSlotForGy = 30;
		}
		
			
	}
	public BattleField() {
		super();
	}
	
	
	
	
	
}
