public class Tile {
	
	private boolean isWorkable;
	private Gold gold;
	private Production production;
	private Food food;
	
	public Tile(boolean isWorkable, int food, int production, int gold) {
		this.gold = new Gold(gold);
		this.food = new Food(food);
		this.production = new Production(production);
		this.isWorkable = isWorkable;
	}
	
	public Gold getGold() {
		return gold;
	}
	
	public Food getFood() {
		return food;
	}
	
	public Production getProd() {
		return production;
	}
	
	public boolean isWorkable() {
		return isWorkable;
	}
}

