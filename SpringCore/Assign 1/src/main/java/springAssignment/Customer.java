package springAssignment;

public class Customer {

	public int customerId;
	public String customerName;
	public double  customerContact;
	public Address customerAddress;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(double customerContact) {
		this.customerContact = customerContact;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	public void details()
	{
		System.out.println(" Customer id: "+getCustomerId()+",\n CustomerName:"+getCustomerName()+",\n CustomerContact:"+getCustomerContact()+",\n CustomerAddress: "+getCustomerAddress().getStreet()+","+getCustomerAddress().getCity()+","+getCustomerAddress().getState()+","+getCustomerAddress().getZip()+","+getCustomerAddress().getCountry());
	}
}
