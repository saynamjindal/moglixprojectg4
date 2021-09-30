package com.moglix.catalogproject;

import com.moglix.catalogproject.dto.Catalog;
import com.moglix.catalogproject.service.CatalogServiceDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CatalogServiceDemo catalogService = new CatalogServiceDemo();
		
		
		Catalog catalog = new Catalog();
		
		catalog.setProduct_ID("A001");
		catalog.setCat_ID("1A");
		catalog.setProduct_Description("Water Bottle");
		catalog.setProduct_Image("noimage");
		catalog.setProduct_Name("Kool Sonic 900");
		
		System.out.println(catalog.getProduct_ID());
		System.out.println(catalog.getProduct_Name());
		
		String result2 = catalogService.addCatalog(catalog);
		
		Catalog catalog2=catalogService.getCatalogById("ab001");
		
		
		if(catalog2==null)
			System.out.println("catalog id doesn't exist");
		else
			System.out.println("catalog exists");
		
		Catalog catalogs[]=catalogService.getCatalogs();
		
		for (Catalog catalog3 : catalogs) {
			if(catalog3!=null) {
				System.out.println(catalog3);
				System.out.println(catalog3.toString());
			}
		}
//		catalogService.deleteAllCataloges();
		
		catalogService.addupdateCatalog("A001",catalog);
		for (Catalog catalog3 : catalogs) {
			if(catalog3!=null) {
				System.out.println(catalog3);
				System.out.println(catalog3.toString());
			}
		}

	}

}
