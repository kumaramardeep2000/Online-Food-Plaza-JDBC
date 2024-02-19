package com.project.coreJava.DTO;

public class OrderDTO {
	private Integer Customer_id;
	private Integer cart_id;
	private Integer order_id;
	private String address;
	private double total_bill;
	private String transaction_type;
	public OrderDTO() {
	
	}
	public OrderDTO(Integer customer_id, Integer cart_id, Integer order_id, String address, double total_bill,
			String transaction_type) {
		super();
		Customer_id = customer_id;
		this.cart_id = cart_id;
		this.order_id = order_id;
		this.address = address;
		this.total_bill = total_bill;
		this.transaction_type = transaction_type;
	}
	public OrderDTO(Integer customer_id, Integer cart_id, String address, double total_bill, String transaction_type) {
		super();
		Customer_id = customer_id;
		this.cart_id = cart_id;
		this.address = address;
		this.total_bill = total_bill;
		this.transaction_type = transaction_type;
	}
	public Integer getCustomer_id() {
		return Customer_id;
	}
	public void setCustomer_id(Integer customer_id) {
		Customer_id = customer_id;
	}
	public Integer getCart_id() {
		return cart_id;
	}
	public void setCart_id(Integer cart_id) {
		this.cart_id = cart_id;
	}
	public Integer getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getTotal_bill() {
		return total_bill;
	}
	public void setTotal_bill(double total_bill) {
		this.total_bill = total_bill;
	}
	public String getTransaction_type() {
		return transaction_type;
	}
	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}
	@Override
	public String toString() {
		return "OrderDTO [Customer_id=" + Customer_id + ", cart_id=" + cart_id + ", order_id=" + order_id + ", address="
				+ address + ", total_bill=" + total_bill + ", transaction_type=" + transaction_type + "]";
	}
	
        
}
