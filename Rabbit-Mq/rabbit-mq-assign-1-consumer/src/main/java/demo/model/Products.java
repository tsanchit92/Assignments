package demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Products {
	
	public int id;
	public String name;
	public int price;
	public String category;
	public int quantity;
	

}
