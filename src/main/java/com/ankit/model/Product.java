package com.ankit.model;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Product {
	
  @Id 
  private int pcode;
  private int discount;
  @Size(min=3 , max=10)
  @Pattern(regexp="[a-zA-Z]*")
  private String pname;
  @Min(100)
  private int price;
  private Blob photo;
  
  
public Blob getPhoto() {
	return photo;
}
public void setPhoto(Blob photo) {
	this.photo = photo;
}
public int getPcode() {
	return pcode;
}
public void setPcode(int pcode) {
	this.pcode = pcode;
}
public int getDiscount() {
	return discount;
}
public void setDiscount(int discount) {
	this.discount = discount;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "Product [pcode=" + pcode + ", discount=" + discount + ", pname=" + pname + ", price=" + price + ", photo="
			+ photo + "]";
}
  
  
}
