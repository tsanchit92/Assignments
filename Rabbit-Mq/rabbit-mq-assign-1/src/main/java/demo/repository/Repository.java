package demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import demo.model.Products;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Products, Integer> {

	@Query(value = "select * from prod as a where a.quantity < 10",nativeQuery = true)
	public List<Products> findByQuantity();
}
