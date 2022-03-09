package security.assign4.four;

import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Model,Integer>
{
	Model findByUserName(String userName);
	
}
