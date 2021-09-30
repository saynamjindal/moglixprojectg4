package com.moglix.catalogproject.service;

import com.moglix.catalogproject.dto.Catalog;

public interface CatalogService {
	
	public String addCatalog(Catalog catalog);
	public Catalog getCatalogById(String id);
	public Catalog[] getCatalogs();
	public String deleteCatalogById(String id);
	public void deleteAllCatalogs();
	public String updateCatalog(String product_id, Catalog catalog);

}
