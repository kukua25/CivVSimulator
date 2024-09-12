/**
 * The Tile class represents a tile in the game, which can be worked to generate resources
 * such as gold, food, and production. Each tile has attributes that determine whether it is
 * workable and how much of each resource it provides.
 */
public class Tile {
	
	private boolean isWorkable;
	private Gold gold;
	private Production production;
	private Food food;
	
	/**
     * Constructs a Tile with the specified workability and resource values.
     * 
     * @param isWorkable indicates whether the tile can be worked
     * @param food the amount of food this tile generates
     * @param production the amount of production this tile generates
     * @param gold the amount of gold this tile generates
     */
	public Tile(boolean isWorkable, int food, int production, int gold) {
		this.gold = new Gold(gold);
		this.food = new Food(food);
		this.production = new Production(production);
		this.isWorkable = isWorkable;
	}
	
	 /**
     * Returns the amount of gold generated by this tile.
     * 
     * @return a Gold object representing the amount of gold this tile generates
     */
	public Gold getGold() {
		return gold;
	}
	

    /**
     * Returns the amount of food generated by this tile.
     * 
     * @return a Food object representing the amount of food this tile generates
     */
	public Food getFood() {
		return food;
	}
	
	/**
     * Returns the amount of production generated by this tile.
     * 
     * @return a Production object representing the amount of production this tile generates
     */
	public Production getProd() {
		return production;
	}
	
	/**
     * Returns whether the tile is workable or not.
     * 
     * @return true if the tile is workable, false otherwise
     */
	public boolean isWorkable() {
		return isWorkable;
	}
}

