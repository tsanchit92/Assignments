package security.assign4;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import security.assign4.four.Model;
import security.assign4.four.Repository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = Repository.class)
public class Assignment4 implements CommandLineRunner
{
	@Autowired
	Repository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(Assignment4.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		Model m = new Model("user", "pass", true, "ROLE_USER", true, 0, new Date());
		repo.save(m);

	}

}
