package com.wf.corona.dao;

import java.util.List;

import com.wf.corona.exception.CoronaException;
import com.wf.corona.model.ProductMasterList;




public interface ProductMasterDao {
	
	ProductMasterList add(ProductMasterList productMaster) throws CoronaException;
	ProductMasterList save(ProductMasterList productMaster) throws CoronaException;
	boolean deleteById(Integer productMasterdId) throws CoronaException;
	
	List<ProductMasterList> getAll() throws CoronaException;
	ProductMasterList getById(Integer ProductMasterId) throws CoronaException;
	
	 
	 
}