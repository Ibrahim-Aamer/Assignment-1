import org.junit.*;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestDataStructure {

	private Array array;
	
	@Before
	public void setup() 
	{
		//------------------------------------------------
		//Creating "Array" object and setting its values
		array = new Array();
		array.insert(6, 0);
		array.insert(0, 1);
		array.insert(9, 2);
		array.insert(3, 3);
		array.insert(8, 4);
		//------------------------------------------------
		//Creating "Linked list" object and initializing
		
		
		//------------------------------------------------
		
	}
	
	
	@Test
	public void TestFullArray() 
	{
		//Searching for 3 in array, should return 1
		Assert.assertEquals(array.linearSearch(3),true);
		//Searching for 3 in array(binary), should return 1
		Assert.assertEquals(array.binarySearch(3,0,6),true);
		
		array.delete(3);//Now deleting 3
		
		//Negative test
		//Searching for 3 in array, should return 1
		Assert.assertEquals(array.linearSearch(3),false);
		//Searching for 3 in array(binary), should return 1
		Assert.assertEquals(array.binarySearch(3,0,6),false);
		
		array.bubbleSort();
		
		//-----------------------------------------------------
		// Create a stream to hold the output meant for terminal
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		// IMPORTANT: Save the old System.out!
		PrintStream old = System.out;
		// Tell Java to use your special stream
		System.setOut(ps);
		// Print some output: goes to your special stream
		array.display();
		// Put things back
		System.out.flush();
		System.setOut(old);
		//-----------------------------------------------------
		
		String expectedResult = "0 6 8 9 \r\n"+ "";
		String result = baos.toString();//Getting stored string
		
		Assert.assertEquals(expectedResult, result);
		//fail("Not yet implemented");
	}

	

}
