package assign5;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:dbconfig.properties")
public class Project {
	private String projectName;

	
	
	public Project(String projectName) {
		this.projectName = projectName;
		
	}
	
	public String getProjectName() {
		return projectName;
	}
	@Value("SPRING")
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public void display()
	{
		System.out.println("user.Name"+getProjectName()+" Project [projectName=" + projectName+ "]");
	}

	

}
