/**
 * The Resource class represents a generic resource in the game, such as gold, food, or production.
 * It holds the amount of the resource and provides methods to access it.
 */
public class Resource {
	
	private int amount;
	
	/**
	 * Constructs a Resource with the specified amount
	 * 
	 * @param amount is the quanity of the resource
	 * 
	 */
	public Resource(int amount) {
		this.amount = amount;
	}
	
	/**
	 * 
	 * @return the quantity of the resource 
	 */
	public int getAmount() {
		return amount;
	}
	
}





