package demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		//creating spring container
		ApplicationContext context=new ClassPathXmlApplicationContext("demo1/config1.xml");
		
		//get customer object from container
		/*Customer customer=(Customer)context.getBean("cus");//casting obj type to customer type
		
		System.out.println("name : "+customer.getName());
		System.out.println("contact : "+ customer.getContact());
		System.out.println("adress : "+ customer.getAdress());*/
		
		
		// get order
		Order order=(Order)context.getBean("ord");
		
		System.out.println("productId : "+ order.toString());
		//System.out.println("productName : "+ order.getProductName());
		//System.out.println("customer : "+ order.getCustomer().getName());
		
	
	}

}
