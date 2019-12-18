package model;

public class House {
	
    private int levelOfHouse;
    private int levelOfWall;
    private int typeOfHouse = 3; //0: của mình, 1: của đồng minh, 2: của địch, 3: Chưa có nhà
    private BattleField battleField;
    private Army army = new Army();
    
    public int getLevelOfHouse() {
        return levelOfHouse;
    }

    public void setLevelOfHouse(int levelOfHouse) {
        this.levelOfHouse = levelOfHouse;
    }

    public int getLevelOfWall() {
        return levelOfWall;
    }

    public void setLevelOfWall(int levelOfWall) {
        this.levelOfWall = levelOfWall;
    }

    public BattleField getBattleField() {
		return battleField;
	}

	public void setBattleField(BattleField battleField) {
		this.battleField = battleField;
	}

	public Army getArmy() {
		return army;
	}

	public void setArmy(Army army) {
		this.army = army;
	}

	public int getTypeOfHouse() {
        return typeOfHouse;
    }

    public void setTypeOfHouse(int typeOfHouse) {
        this.typeOfHouse = typeOfHouse;
    }
}
