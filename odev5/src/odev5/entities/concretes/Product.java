package odev5.entities.concretes;

import odev5.entities.abstracts.Entity;

public class Product implements Entity {

	private int productId;
	private int categoryId;
	private String productName;
	private double unitPrice;
	private int unitInStock;

	public Product() {
		
	}

	public Product(int productId, int categoryId, String productName, double unitPrice, int unitInStock) {

		this.productId = productId;
		this.categoryId = categoryId;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.unitInStock = unitInStock;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getUnitInStock() {
		return unitInStock;
	}

	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}

}
