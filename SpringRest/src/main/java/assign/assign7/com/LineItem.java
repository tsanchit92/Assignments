package assign.assign7.com;

import java.util.List;

public class LineItem {
	private Orders o;
	int quantity;
	String product;
	private int id;
	
	private List<LineItem> li;

	public int getId() {
		return id;
	}
	public void setId()
	{
		this.id=o.getId();
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public LineItem(int id, int quantity, String product) {
		super();
		this.id = o.getId();
		this.quantity = quantity;
		this.product = product;
	}
	LineItem li1 = new LineItem(o.getId(),1,"candy");
	LineItem li2 = new LineItem(o.getId(),1,"softie");
	LineItem li3 = new LineItem(o.getId(),1,"coke");
	
	public List<LineItem> getItemList()
	{
		li.add(li1);
		li.add(li2);
		li.add(li3);
		return li;
	}
	
	

	public LineItem() {

	}

}
