package assign.assign5.com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	Repo repo;
	public List<Employee> getList()
	{
		List<Employee> EList = new ArrayList<Employee>();
		repo.findAll().forEach(List1 -> EList.add(List1));
		return EList;
	}
	public Employee getById(long id)
	{
		return repo.findById(id).get();
	}

	public void saveOrUpdate(Employee emp)
	{
		repo.save(emp);
	}

	public void delete(long id)
	{
		repo.deleteById(id);
	}

	public void update(Employee emp, int id)
	{
		repo.save(emp);
	}
}
