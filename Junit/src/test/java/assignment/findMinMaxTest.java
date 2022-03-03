
package assignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class findMinMaxTest {
	
	findMinMax t;
	@BeforeEach
	void init() {
		t=new findMinMax();
	}
	@Test
	void test1()
	{
		int[] actual = t.FindMinMax( new int[]{56, 34, 7,3, 54, 3, 34, 34, 53} );
		assertArrayEquals(actual, new int[]{3,56}, "code ran successfully");
		
	}
	@Test
	void test2()	
	{
		int []actual =t.FindMinMax(new int[]{16, 34, 7,5, 14, 1, 54, 22, 57});
		assertArrayEquals(actual, new int[]{1,57}, "code again ran successfully");
	}
	@Test
	void test3()	
	{
		int []actual =t.FindMinMax(new int[]{2,8,5,0,7,14,85,77,65});
		assertArrayEquals(actual, new int[]{0,85}, "code again ran successfully");
	}
	

}
