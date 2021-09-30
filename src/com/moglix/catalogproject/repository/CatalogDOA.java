package com.moglix.catalogproject.repository;

import com.moglix.catalogproject.dto.Catalog;

public class CatalogDOA {

	private static int counter=0;
	
	Catalog catalogs[]= new Catalog[10];
	
	public String addCatalog(Catalog catalog) {
			
			if(counter<catalogs.length) {
				
				catalogs[counter++]=catalog;
				return "success";
				
			}else
				return "array is full";
	}
		
	public Catalog getCatalogById(String id) {
			
			for (Catalog catalog : catalogs) {
				
				if(catalog!=null  && id.equals(catalog.getProduct_ID())){
					return catalog;
				}
			}
			return null;
		}
		
		public Catalog[] getCatalogs() {
			return catalogs;
			
		}
		public String deleteCatalogById(String id) {
			return "";
		}
		
	//	public void deleteAllCatalogs() {
	//		catalogs=null;
	//	}
		
			public String updateCatalog(String product_id, Catalog catalog) {
				for (Catalog cat : catalogs) {
					if(cat !=null && cat.getProduct_ID().equalsIgnoreCase(product_id)) {
						cat.setProduct_Name("Kool Sonic 700");
						
					}
				}
				return "updated successfully";
			}
			
			
			
}
