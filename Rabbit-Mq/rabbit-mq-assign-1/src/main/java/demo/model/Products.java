package demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity()
@Table(name="prod")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Products {
	
	@Id
	public int id;
	public String name;
	public int price;
	public String category;
	public int quantity;
	

}
