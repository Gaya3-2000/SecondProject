package demo1;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Customer {
	private String name;
	private int contact;
	private Properties adress;
	
	public Customer(String name, int contact,Properties adress) {
		this.name=name;
		this.contact=contact;
		this.adress=adress;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", contact=" + contact + ", adress=" + adress + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
