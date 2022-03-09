package security.assign4.four;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelService {

	@Autowired
	Repository repo;

	public Model getUserByName(String username) {
		return repo.findByUserName(username);
	}

	public void increasefailedAttempt(Model model)
	{
		int newfailedAttempt =model.getFailedAttemp()+1;
		model.setFailedAttemp(newfailedAttempt);
		 repo.save(model);
	}
	public void lock(Model model)
	{
		model.setAccountNonLocked(false);
		model.setLocktime(new Date());
		repo.save(model);
		
	}
}
