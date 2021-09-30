package com.moglix.catalogproject.repository;

import com.moglix.catalogproject.dto.Catalog;



public class CatalogRepositoryImpl implements CatalogRepository {
	
	
	private CatalogRepositoryImpl() {
		
	}
	
	public static CatalogRepository getInstance() {
		if(catalogRepository==null) {
			catalogRepository=new CatalogRepositoryImpl();
			return catalogRepository;
			}
		else {
			return catalogRepository;
		}
		
	}
	private static CatalogRepository catalogRepository;

	
	private static int counter=0;
	
	Catalog catalogs[]= new Catalog[10];

	@Override
	public String addCatalog(Catalog catalog) {
		if(counter<catalogs.length) {
			
			catalogs[counter++]=catalog;
			return "success";
			
		}else
			return "array is full";
	}

	@Override
	public Catalog getCatalogById(String id) {
		
		for (Catalog catalog : catalogs) {
			
			if(catalog!=null  && id.equals(catalog.getProduct_ID())){
				return catalog;
			}
		}
		return null;
	}

	@Override
	public Catalog[] getCatalogs() {
		return catalogs;
		
	}
	private int getIndex(String id) {
		for (int i = 0; i < catalogs.length; i++) {
			if(catalogs[i].getProduct_ID().equals(id)) {
				return i;
			}
		}
		return -1;
	}
	

	@Override
	public String deleteCatalogById(String id) {
		Catalog catalog =this.getCatalogById(id);
		//we will get the employee which we want to delete
		
		int index=this.getIndex(id);
		
		if(index!=-1) {
			catalogs[index]=null;
			return "delete success ";
		}
		
		return "deletion failed! User not found";

	}

	@Override
	public void deleteAllCatalogs() {
		// TODO Auto-generated method stub
		catalogs=null;
	}

	@Override
	public String updateCatalog(String product_id, Catalog catalog) {
		for (Catalog cat : catalogs) {
			if(cat !=null && cat.getProduct_ID().equalsIgnoreCase(product_id)) {
				cat.setProduct_Name("Kool Sonic 700");
				
			}
		}
		return "updated successfully";
	}

}
