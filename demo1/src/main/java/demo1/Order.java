package demo1;

//import java.util.Date;

public class Order {
    private String productId;
    private String productName;
    //private Date orderDate;
    private Customer customer;
	
    public Order(String productId,String productName,Customer customer) {
    	this.productId=productId;
    	this.productName=productName;
    	this.customer=customer;
    }

	@Override
	public String toString() {
		return "Order [productId=" + productId + ", productName=" + productName + ", customer=" + customer
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
    
    
}
