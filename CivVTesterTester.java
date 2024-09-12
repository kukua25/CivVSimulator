/**
 * The CivVTesterTester class serves as the main entry point for running tests related to 
 * various city settlements in the game. It creates an instance of CivVTest and calls
 * test methods for different cities such as Berlin, Delhi, Philadelphia, and Amsterdam.
 */
public class CivVTesterTester {
	public static void main(String[] args) {
		
		CivVTest test1 = new CivVTest();
		
		// test cases for various cities
		test1.berlinTest();
		test1.delhiTest();
		test1.phillyTest();
		test1.amsterdamTest();
		
		
		
	}
}
