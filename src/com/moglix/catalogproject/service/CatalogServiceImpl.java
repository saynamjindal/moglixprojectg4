package com.moglix.catalogproject.service;

import com.moglix.catalogproject.dto.Catalog;
import com.moglix.catalogproject.repository.CatalogRepository;
import com.moglix.catalogproject.repository.CatalogRepositoryImpl;


public class CatalogServiceImpl implements CatalogService {
	
	CatalogRepository catalogRepository= CatalogRepositoryImpl.getInstance();
	
	private  CatalogServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	private static CatalogService catalogService;
	
	private static CatalogService getInstance() {
		if(catalogService==null) {
			catalogService=new CatalogServiceImpl();
			return catalogService;
			}
		else {
			return catalogService;
		}
	}
	
	

	@Override
	public String addCatalog(Catalog catalog) {
		return catalogRepository.addCatalog(catalog);
	}

	@Override
	public Catalog getCatalogById(String id) {
		return catalogRepository.getCatalogById(id);
	}

	@Override
	public Catalog[] getCatalogs() {
		return catalogRepository.getCatalogs();
	}

	@Override
	public String deleteCatalogById(String id) {
		return catalogRepository.deleteCatalogById(id);
	}

	@Override
	public void deleteAllCatalogs() {
		catalogRepository.deleteAllCatalogs();

	}

	@Override
	public String updateCatalog(String product_id, Catalog catalog) {
		return catalogRepository.updateCatalog(product_id, catalog);
	}

}
