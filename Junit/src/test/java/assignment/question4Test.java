package assignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

class question4Test
{
	
	@BeforeAll
	static void check()
	{
		System.out.println("If not necessary dont use zero and negative no");
	}
	
	question4 t;
	
	@BeforeEach
	void init() {
		t=new question4();
	}
	
	
	@DisplayName("Adding two no")
	@Test
	void testadd() 
	{
		assertEquals(2,t.add(1,1),"Success");
	}

	@DisplayName("Subtractig two no")
	@Test
	void testsub() 
	{
		assertEquals(0,t.add(1,1),"Success");
	}
	@DisplayName("Multiplying  two no")
	@Test
	void testmult() 
	{
		assertEquals(1,t.add(1,1),"Success");
	}

	@AfterEach
	void print()
	{
		System.out.println(t.add(1, 1)+" "+t.sub(1, 1)+" "+t.mult(1, 1));
	}
	@AfterAll
	static void check1()
	{
		System.out.println("All methods ran successfully");
	}


}
