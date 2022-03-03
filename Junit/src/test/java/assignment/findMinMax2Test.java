package assignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


class findMinMax2Test 
{
	@Nested
	@DisplayName("Finding minimum")
	class findMin
	{
		findMinMax2 a;
		@BeforeEach
		void init()
		{
			a=new findMinMax2();
		}
		@Test
		void testCase1()
		{
			int actual = a.findMin( new int[]{56, 34, 7, 54, 3,  53} );
			assertEquals(actual,3,"minimum should be returned"); 
		}
		@Test
		void testCase2()
		{
			int actual = a.findMin( (new int[]{16, 34, 7,5, 14, 1, 54, 22, 57}));
			assertEquals(actual,1,"minimum should be returned"); 
		}
	}
		@Nested
		@DisplayName("Finding maximum")
		class findMax
		{
			findMinMax2 a;
			@BeforeEach
			void init()
			{
				a=new findMinMax2();
			}
			@Test
			void testCase1()
			{
				int actual = a.findMax( new int[]{56, 34, 7, 54, 3,  53} );
				assertEquals(actual,56,"maximum should be returned"); 
			}
			@Test
			void testCase2()
			{
				int actual = a.findMax( (new int[]{16, 34, 7,5, 14, 1, 54, 22, 57}));
				assertEquals(actual,57,"maximum should be returned"); 
			}
		}
}
	
	


