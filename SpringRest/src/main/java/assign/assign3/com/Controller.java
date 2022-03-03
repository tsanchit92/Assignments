package assign.assign3.com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	/*
	 * @RequestMapping(value = "/Address/{zipcode}", method = RequestMethod.GET,
	 * headers = "Accept=application/json") public InternationalAddress
	 * getCountryByZip(@PathVariable int zipcode) { List<InternationalAddress>
	 * CountriesAvailable = new ArrayList<InternationalAddress>();
	 * CountriesAvailable = List();
	 * 
	 * for (InternationalAddress I : CountriesAvailable) { if (I.getZipcode() ==
	 * zipcode) return I; }
	 * 
	 * return null; }
	 */
	
	
	@RequestMapping(value = "/Address", method = RequestMethod.POST)
	public InternationalAddress getCountry(@RequestBody InternationalAddress Ia) {
		List<InternationalAddress> CountriesAvailable = new ArrayList<InternationalAddress>();
		CountriesAvailable = Lister();
		for (InternationalAddress I : CountriesAvailable)
		{
			if (I.getZipcode() == Ia.getZipcode())
			{
				return I;
			}
		
		}
		return null;
	}

	public List<InternationalAddress> Lister() {
		InternationalAddress c1 = new InternationalAddress(111111, "Lucknow", "UttarPradesh", "India");
		InternationalAddress c2 = new InternationalAddress(222222, "Agra", "UttarPradesh", "India");
		InternationalAddress c3 = new InternationalAddress(333333, "Jalandhar", "Punjab", "India");
		InternationalAddress c4 = new InternationalAddress(444444, "Phagwara", "Punjab", "India");
		InternationalAddress c5 = new InternationalAddress(555555, "Hyderabad", "Hyderabad", "India");

		List<InternationalAddress> CountriesAvailable1 = new ArrayList<InternationalAddress>();

		CountriesAvailable1.add(c1);
		CountriesAvailable1.add(c2);
		CountriesAvailable1.add(c3);
		CountriesAvailable1.add(c4);
		CountriesAvailable1.add(c5);

		return CountriesAvailable1;
	}
}
