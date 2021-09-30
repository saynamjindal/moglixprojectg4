package com.moglix.catalogproject.dto;

public class Catalog {

	private String Product_ID;
	private String Product_Name;
	private String Cat_ID;
	private String Product_Description;
	private String Product_Image;
	
	@Override
	public String toString() {
		return "Catalog [Product_ID=" + Product_ID + ", Product_Name=" + Product_Name + ", Cat_ID=" + Cat_ID
				+ ", Product_Description=" + Product_Description + ", Product_Image=" + Product_Image + "]";
	}
	
	public Catalog(String product_ID, String product_Name, String cat_ID, String product_Description,
			String product_Image) {
		super();
		Product_ID = product_ID;
		Product_Name = product_Name;
		Cat_ID = cat_ID;
		Product_Description = product_Description;
		Product_Image = product_Image;
	}
	public Catalog() {
		
	}
	public String getProduct_ID() {
		return Product_ID;
	}
	public void setProduct_ID(String product_ID) {
		Product_ID = product_ID;
	}
	public String getProduct_Name() {
		return Product_Name;
	}
	public void setProduct_Name(String product_Name) {
		Product_Name = product_Name;
	}
	public String getCat_ID() {
		return Cat_ID;
	}
	public void setCat_ID(String cat_ID) {
		Cat_ID = cat_ID;
	}
	public String getProduct_Description() {
		return Product_Description;
	}
	public void setProduct_Description(String product_Description) {
		Product_Description = product_Description;
	}
	public String getProduct_Image() {
		return Product_Image;
	}
	public void setProduct_Image(String product_Image) {
		Product_Image = product_Image;
	}
	
}
