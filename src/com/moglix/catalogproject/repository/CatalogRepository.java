package com.moglix.catalogproject.repository;

import com.moglix.catalogproject.dto.Catalog;

public interface CatalogRepository {
	
	public String addCatalog(Catalog catalog);
	public Catalog getCatalogById(String id);
	public Catalog[] getCatalogs();
	public String deleteCatalogById(String id);
	public void deleteAllCatalogs();
	public String updateCatalog(String product_id, Catalog catalog);

}
