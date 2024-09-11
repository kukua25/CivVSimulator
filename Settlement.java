public class Settlement {
	
	private int population;
	private Tile cityTile;
	private Tile[][] tiles;
	private boolean[][] tilesWorked;
	
	public Settlement(int population, Tile cityTile, Tile[][] tiles, boolean[][] workedTiles) {
		this.population = population;
		this.cityTile = cityTile;
		this.tiles = tiles;
		this.tilesWorked = workedTiles;
	}
	
	public int getGeneratedGold() {
		int gold = cityTile.getGold().getAmount();
		for(int row = 0; row < tiles.length; row++) {
			for(int col = 0; col < tiles[row].length; col++) {
				if (tiles[row][col] != null && tilesWorked[row][col]) {
					gold += tiles[row][col].getGold().getAmount();
				}
			}
		}
		return gold;
	}
	
	public int getGeneratedFood() {
		int food = cityTile.getFood().getAmount();
		for (int row = 0; row < tiles.length; row++) {
			for (int col = 0; col < tiles[row].length; col++) {
				if (tiles[row][col] != null && tilesWorked[row][col]) {
					food += tiles[row][col].getFood().getAmount();
				}
			}
		}
		return food;
	}
	
	public int getGeneratedProd() {
		int prod = cityTile.getProd().getAmount();
		for (int row = 0; row < tiles.length; row++) {
			for (int col = 0; col < tiles[row].length; col++) {
				if (tiles[row][col] != null && tilesWorked[row][col]) {
					prod += tiles[row][col].getProd().getAmount();
				}
			}
		}
		return prod;
	}
	
}