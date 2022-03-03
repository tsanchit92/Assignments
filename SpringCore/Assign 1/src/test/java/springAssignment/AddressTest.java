package springAssignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddressTest {

	@Test
	void test()
	{
		Customer c =new Customer();
		c.setCustomerId(1);;
		c.setCustomerName("Ram");
		c.setCustomerContact(524484);
		
		
		assertEquals(1,c.getCustomerId());
		assertEquals("Ram",c.getCustomerName());
		assertEquals(524484,c.getCustomerContact());
		
		
		
	}

}
