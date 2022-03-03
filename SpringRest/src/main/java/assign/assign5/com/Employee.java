package assign.assign5.com;




import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

	@Document(collection="Employee")
	public class Employee {
		@Id
		private long id;
	
		private String name;
	
		private String dept;
	
		private String desig;
		
		private long salary;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDept() {
			return dept;
		}

		public void setDept(String dept) {
			this.dept = dept;
		}

		public String getDesig() {
			return desig;
		}

		public void setDesig(String desig) {
			this.desig = desig;
		}

		public long getSalary() {
			return salary;
		}

		public void setSalary(long salary) {
			this.salary = salary;
		}
	}



