package com.wf.corona.service;

import java.util.List;

import com.wf.corona.exception.CoronaException;
import com.wf.corona.model.ProductMasterList;


public interface AdminService {

	ProductMasterList	  validateAndAdd(ProductMasterList productMaster) throws CoronaException;
ProductMasterList	  validateAndSave(ProductMasterList productMaster) throws CoronaException;
	  
	  boolean deleteProductMaster(Integer productMasterId) throws CoronaException;
	  
	  ProductMasterList getProductMaster(Integer productMasterId) throws CoronaException; 
	  List<ProductMasterList> getAllProductMasters() throws CoronaException;
	 
}
