package com.moglix.catalogproject.service;

import com.moglix.catalogproject.dto.Catalog;
import com.moglix.catalogproject.repository.CatalogDOA;

public class CatalogServiceDemo {
	
	CatalogDOA catalogDOA= new CatalogDOA();
	
	public String addCatalog(Catalog catalog) {
			
			// service is consuming dao method
			return catalogDOA.addCatalog(catalog);
			
					
		}
	
	public Catalog getCatalogById(String product_id) {
		return catalogDOA.getCatalogById(product_id);
		
	}
	
	public Catalog[] getCatalogs() {
		return catalogDOA.getCatalogs();
		
	}
//	public void deleteAllCatalogs() {
//		employeeDAO.deleteAllCatalogs();
//	}
	public String addupdateCatalog(String product_id, Catalog cataloge1) {
		return catalogDOA.updateCatalog(product_id, cataloge1);
		
	}

}
