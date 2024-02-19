package com.project.coreJava.DTO;

public class CartDTO {
	
	private Integer customer_id;
	private Integer product_id;
	private int c_id  ; 
	private int quantity;
	private int price;
	private int total_price;
	public CartDTO() {

	}
	public CartDTO(Integer customer_id, Integer product_id, int c_id, int quantity, int price, int total_price) {
		super();
		this.customer_id = customer_id;
		this.product_id = product_id;
		this.c_id = c_id;
		this.quantity = quantity;
		this.price = price;
		this.total_price = total_price;
	}
	public CartDTO(Integer customer_id, Integer product_id, int quantity, int price, int total_price) {
		super();
		this.customer_id = customer_id;
		this.product_id = product_id;
		this.quantity = quantity;
		this.price = price;
		this.total_price = total_price;
	}
	public Integer getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}
	public Integer getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTotal_price() {
		return total_price;
	}
	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}
	@Override
	public String toString() {
		return "CartDTO [customer_id=" + customer_id + ", product_id=" + product_id + ", c_id=" + c_id + ", quantity="
				+ quantity + ", price=" + price + ", total_price=" + total_price + "]";
	}
	

}
