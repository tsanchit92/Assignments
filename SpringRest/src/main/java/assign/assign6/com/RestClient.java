package assign.assign6.com;


import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestClient {
	private static final String Add_api="http://localhost:8080/add" ;
	private static final String Subtract_api="http://localhost:8080/subtract" ;
	private static final String Multiply_api="http://localhost:8080/multiply" ;
	private static final String Divide_api="http://localhost:8080/divide" ; 
	private static final String Root_api="http://localhost:8080/root/{c}" ;
	
	static RestTemplate rt=new RestTemplate();	
	 
	public static void main(String[] args) {
		
		
	}
	private static void AddApi()
	{
		/*
		 * HttpHeaders headers=new HttpHeaders();
		 * headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		 * HttpEntity<String> entity =new HttpEntity<>("parameters",headers);
		 * ResponseEntity<String> result = rt.exchange(Add_api, HttpMethod.GET,
		 * entity,String.class); System.out.println(result);
		 *//* for get method */
		Calculator cl=new Calculator(5,5);
		ResponseEntity<Calculator> res = rt.postForEntity(Add_api, cl,Calculator.class);
		System.out.println(res.getStatusCodeValue());
	}
	private static void SubtractApi()
	{
		/*
		 * HttpHeaders headers=new HttpHeaders();
		 * headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		 * HttpEntity<String> entity =new HttpEntity<>("parameters",headers);
		 * ResponseEntity<String> result = rt.exchange(Add_api, HttpMethod.GET,
		 * entity,String.class); System.out.println(result);
		 *//* for get method */
		Calculator cl=new Calculator(5,5);
		ResponseEntity<Calculator> res = rt.postForEntity(Subtract_api, cl,Calculator.class);
		System.out.println(res.getStatusCodeValue());
	}
	private static void MultiplyApi()
	{
		/*
		 * HttpHeaders headers=new HttpHeaders();
		 * headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		 * HttpEntity<String> entity =new HttpEntity<>("parameters",headers);
		 * ResponseEntity<String> result = rt.exchange(Add_api, HttpMethod.GET,
		 * entity,String.class); System.out.println(result);
		 *//* for get method */
		Calculator cl=new Calculator(5,5);
		ResponseEntity<Calculator> res = rt.postForEntity(Multiply_api, cl,Calculator.class);
		System.out.println(res.getStatusCodeValue());
	}
	private static void DivideApi()
	{
		/*
		 * HttpHeaders headers=new HttpHeaders();
		 * headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		 * HttpEntity<String> entity =new HttpEntity<>("parameters",headers);
		 * ResponseEntity<String> result = rt.exchange(Add_api, HttpMethod.GET,
		 * entity,String.class); System.out.println(result);
		 *//* for get method */
		Calculator cl=new Calculator(5,5);
		ResponseEntity<Calculator> res = rt.postForEntity(Divide_api, cl,Calculator.class);
		System.out.println(res.getStatusCodeValue());
	}
	private static void RootApi()
	{
		/*
		 * HttpHeaders headers=new HttpHeaders();
		 * headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		 * HttpEntity<String> entity =new HttpEntity<>("parameters",headers);
		 * ResponseEntity<String> result = rt.exchange(Add_api, HttpMethod.GET,
		 * entity,String.class); System.out.println(result);
		 *//* for get method */
		Calculator cl=new Calculator(49.00);
		ResponseEntity<Calculator> res = rt.postForEntity(Root_api, cl,Calculator.class);
		System.out.println(res.getStatusCodeValue());
	}
}
