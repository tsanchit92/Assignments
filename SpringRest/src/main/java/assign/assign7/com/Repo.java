package assign.assign7.com;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface Repo extends  MongoRepository<Orders, Integer> 
{
	

}
