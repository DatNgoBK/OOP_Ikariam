package model;

public class Artillery extends UnitFighter {
	
	private int nearHit;
	private int accuracyNearHit;
	private int longHit;
	private int accuracyLongHit;
	private int munition;
	
	public int getNearHit() {
		return nearHit;
	}
	public void setNearHit(int nearHit) {
		this.nearHit = nearHit;
	}
	public int getAccuracyNearHit() {
		return accuracyNearHit;
	}
	public void setAccuracyNearHit(int accuracyNearHit) {
		this.accuracyNearHit = accuracyNearHit;
	}
	public int getLongHit() {
		return longHit;
	}
	public void setLongHit(int longHit) {
		this.longHit = longHit;
	}
	public int getAccuracyLongHit() {
		return accuracyLongHit;
	}
	public void setAccuracyLongHit(int accuracyLongHit) {
		this.accuracyLongHit = accuracyLongHit;
	}
	public int getMunition() {
		return munition;
	}
	public void setMunition(int munition) {
		this.munition = munition;
	}
	

	public Artillery() {
		super();
		// TODO Auto-generated constructor stub
	}
}
