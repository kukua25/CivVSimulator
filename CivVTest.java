/**
 * Unit tests for the Civilization V project
 * 
 * @author Derek Miller
 * @version 12/3/2014
 */

public class CivVTest

{
    // All tests assume Tile constructor takes food, production, gold in that order

    public boolean amsterdamTest() {
    	
    	int pop = 64;
    	Tile city = new Tile(true, 5, 2, 5);
    	Tile[][] hexes = {{ new Tile(true, 5, 2, 3), new Tile(true, 1, 0, 0), new Tile(true, 1, 0, 0), new Tile(true, 1, 0, 0), null, null},
    						{new Tile(true, 1, 1, 0), new Tile(true, 5, 2, 3), new Tile(true, 1, 0, 0), new Tile(true, 1, 1, 4), new Tile(true,1, 0, 0), null},
    						{new Tile(true, 0, 0, 0), new Tile(true, 5, 2, 3), new Tile(true, 5, 2, 3), new Tile(true, 1, 1, 4), new Tile(true, 1, 1, 4), new Tile(true, 1, 5, 0)},
    						{new Tile(true, 0, 0, 0), new Tile(true, 5, 2, 3), new Tile(true, 5, 2, 3), new Tile(true, 5, 2, 3), new Tile(true, 5, 2, 3), new Tile(true, 5, 2, 3)},
    						{new Tile(true, 5, 2, 3), new Tile(true, 5, 2, 3), new Tile(true, 3, 3, 0), new Tile(true, 4, 1, 2), new Tile(true, 5, 2, 3), new Tile(true, 1, 0, 0)},
    						{new Tile(true, 5, 2, 3), new Tile(true, 5, 2, 3), new Tile(true, 3, 3, 0), new Tile(true, 4, 1, 2), new Tile(true, 5, 2, 3), null},
    						{new Tile(true, 4, 0, 0), new Tile(true, 3, 0, 0), new Tile(true, 3, 0, 4), new Tile(true, 3, 3, 0), null, null}};
    	
    	boolean[][] workedTiles = {{true,true,true,true,true,true},
    								{true,true,true,true,true,true},
    								{true,true,true,true,true,true},
    								{true,true,true,true,true,true}, /** Center row with city removed **/
    								{true,true,true,true,true,true},
    								{true,true,true,true,true,true},
    								{true,true,true,true,true,true}};
    		
    	Settlement amsterdam = new Settlement(pop,city,hexes,workedTiles);
    	System.out.pridntln("The amount of food is " + amsterdam.getGeneratedFood() + ". It should be 118"); //generated debug output
        System.out.println("The amount of production is " + amsterdam.getGeneratedProd() + ". It should be 52"); //generated debug output
        System.out.println("The amount of Reddit Gold is " + amsterdam.getGeneratedGold() + ". It should be 70"); //generated debug output
        return amsterdam.getGeneratedFood() == 27 && amsterdam.getGeneratedProd() == 29 && amsterdam.getGeneratedGold() == 13;
    	
    	
    }
	
	
	
    public boolean phillyTest()
    {
        int pop = 12;
        Tile city = new Tile(true, 2, 2, 0);
        Tile[][] hexes = {{new Tile(true, 2, 0, 0), new Tile(false, 0, 2, 0), new Tile(false, 5, 0, 0), new Tile(false, 0, 4, 0), null, null},
                            {new Tile(false, 2, 0, 0),new Tile(true, 4, 1, 0),new Tile(true, 1, 3, 2),new Tile(true, 4, 0, 2),new Tile(false, 3, 2, 0),null},
                            {new Tile(true, 5, 0, 0),new Tile(true, 4, 0, 0),new Tile(true, 4, 0, 0),new Tile(true, 0, 4, 2),new Tile(true, 4, 0, 2),new Tile(false, 1, 1, 0)},
                            {new Tile(false,1,1,0),new Tile(true,0,4,0),new Tile(true,4,0,0),new Tile(true,4,0,2),new Tile(true,4,1,2),new Tile(true,3,0,5)}, /** Center row with city removed **/
                            {new Tile(false,2,0,0),new Tile(true,3,2,0),new Tile(true,4,1,0),new Tile(true,1,3,0),new Tile(true,4,0,2),new Tile(true,0,3,2)},
                            {new Tile(false,2,0,0),new Tile(true,4,0,0),new Tile(true,1,1,0),new Tile(true,4,0,0),new Tile(true,1,1,0),null},
                            {new Tile(false,2,0,0),new Tile(false,2,0,0),new Tile(true,2,0,0),new Tile(true,0,5,0),null,null}};
        boolean[][] workedTiles = {{false,false,false,false,false,false},
                                    {false,true,true,false,false,false},
                                    {true,false,false,true,false,false},
                                    {false,true,false,false,true,true}, /** Center row with city removed **/
                                    {false,true,true,true,false,true},
                                    {false,false,false,false,false,false},
                                    {false,false,false,true,false,false}};
        Settlement philly = new Settlement(pop,city,hexes,workedTiles);
        System.out.println("The amount of food is " + philly.getGeneratedFood() + ". It should be 27"); //generated debug output
        System.out.println("The amount of production is " + philly.getGeneratedProd() + ". It should be 29"); //generated debug output
        System.out.println("The amount of Reddit Gold is " + philly.getGeneratedGold() + ". It should be 13"); //generated debug output
        return philly.getGeneratedFood() == 27 && philly.getGeneratedProd() == 29 && philly.getGeneratedGold() == 13;
    }
    
 
    public boolean berlinTest()
    {
        int pop = 14;
        Tile city = new Tile(true, 5, 4, 5);
        Tile[][] hexes = {{new Tile(true, 1, 0, 1), new Tile(true, 1, 3, 0), new Tile(true, 4, 0, 0), new Tile(false, 0, 4, 0), null, null},
                            {new Tile(true, 4, 0, 0),new Tile(true, 4, 0, 0),new Tile(true, 4, 0, 1),new Tile(true, 3, 0, 4),new Tile(false, 2, 0, 0),null},
                            {new Tile(true, 0, 4, 4),new Tile(true, 3, 2, 1),new Tile(true, 1, 3, 1),new Tile(true, 2, 4, 3),new Tile(true, 4, 0, 1),new Tile(false, 4, 0, 0)},
                            {new Tile(true,1,1,0),new Tile(true,1,3,0),new Tile(true,0,4,5),new Tile(true,1,1,2),new Tile(true,3,1,0),new Tile(true,4,1,0)}, /** Center row with city removed **/
                            {new Tile(true,1,0,1),new Tile(true,4,0,0),new Tile(true,1,0,1),new Tile(true,1,3,0),new Tile(true,0,4,0),new Tile(true,4,0,0)},
                            {new Tile(true,1,0,1),new Tile(true,1,0,1),new Tile(true,1,0,1),new Tile(true,1,0,1),new Tile(true,3,1,0),null},
                            {new Tile(true,1,0,1),new Tile(false,1,0,1),new Tile(true,1,0,1),new Tile(true,1,0,1),null,null}};
        boolean[][] workedTiles = {{false,false,false,false,false,false},
                                    {false,true,true,true,false,false},
                                    {true,true,true,true,true,false},
                                    {false,true,true,false,false,true}, /** Center row with city removed **/
                                    {false,true,false,true,true,false},
                                    {false,false,false,false,false,false},
                                    {false,false,false,false,false,false}};
        Settlement berlin = new Settlement(pop,city,hexes,workedTiles);
        System.out.println("The amount of food is " + berlin.getGeneratedFood() + ". It should be 36"); //generated debug output
        System.out.println("The amount of production is " + berlin.getGeneratedProd() + ". It should be 32"); //generated debug output
        System.out.println("The amount of Reddit Gold is " + berlin.getGeneratedGold() + ". It should be 25"); //generated debug output
        return berlin.getGeneratedFood() == 36 && berlin.getGeneratedProd() == 32 && berlin.getGeneratedGold() == 25;
    }
    
    public boolean delhiTest()
    {
        int pop = 45;
        Tile city = new Tile(true, 5, 4, 5);
        Tile[][] hexes = {{new Tile(true, 2, 0, 2), new Tile(true, 3, 2, 2), new Tile(true, 2, 0, 0), new Tile(true, 4, 0, 0), null, null},
                            {new Tile(true, 2, 0, 2),new Tile(true, 1, 1, 5),new Tile(true, 2, 4, 3),new Tile(true, 2, 3, 5),new Tile(true, 2, 0, 0),null},
                            {new Tile(true, 2, 0, 2),new Tile(true, 2, 0, 2),new Tile(true, 1, 2, 5),new Tile(true, 2, 5, 4),new Tile(true, 4, 1, 2),new Tile(true, 0, 4, 0)},
                            {new Tile(true,2,0,2),new Tile(true,2,0,2),new Tile(true,2,0,2),new Tile(true,1,4,2),new Tile(true,2,1,2),new Tile(true,0,2,0)}, /** Center row with city removed **/
                            {new Tile(true,2,0,2),new Tile(true,2,0,2),new Tile(true,2,0,2),new Tile(true,1,3,0),new Tile(true,1,3,0),new Tile(true,4,0,0)},
                            {new Tile(true,1,3,0),new Tile(true,0,5,0),new Tile(true,1,3,0),new Tile(true,2,5,0),new Tile(true,4,0,0),null},
                            {new Tile(true,1,3,0),new Tile(true,1,3,0),new Tile(true,2,0,0),new Tile(true,0,4,0),null,null}};
        boolean[][] workedTiles = {{true,true,true,true,false,false},
                                    {true,true,true,true,true,false},
                                    {true,true,true,true,true,true},
                                    {true,true,true,true,true,true}, /** Center row with city removed **/
                                    {true,true,true,true,true,true},
                                    {true,true,true,true,true,false},
                                    {true,true,true,true,false,false}};
        Settlement delhi = new Settlement(pop,city,hexes,workedTiles);
        System.out.println("The amount of food is " + delhi.getGeneratedFood() + ". It should be 69"); //generated debug output
        System.out.println("The amount of production is " + delhi.getGeneratedProd() + ". It should be 65"); //generated debug output
        System.out.println("The amount of Reddit Gold is " + delhi.getGeneratedGold() + ". It should be 55"); //generated debug output 
        return delhi.getGeneratedFood() == 69 && delhi.getGeneratedProd() == 65 && delhi.getGeneratedGold() == 55;
    }
}
