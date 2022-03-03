package assign.assign7.com;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class OrderEntryService {
	@Autowired
	private Repo repo;
	
	List<Orders> getOrders()
	{
		return repo.findAll() ;
	}
	public Optional<Orders> getOrderById(int id)
	{
		return repo.findById(id);
	}
	public void  submitOrder(Orders o)
	{	
		 repo.insert(o);
	}
	public void updateOrder(Orders o)
	{
		repo.save(o);
	}
	public void  deleteOrder(Orders o)
	{
		repo.delete(o);
	}
	public void  cancelOrder(Orders o)
	{
		repo.delete(o);
	}
	

}
