package com.wf.corona.service;

import java.util.ArrayList;
import java.util.List;

import com.wf.corona.dao.ProductMasterDao;
import com.wf.corona.dao.ProductMasterDaoImpl;
import com.wf.corona.exception.CoronaException;
import com.wf.corona.model.ProductMasterList;

public class AdminServiceImpl implements AdminService {
	ProductMasterDao productMasterDao;
	
	public AdminServiceImpl() {
		productMasterDao=new ProductMasterDaoImpl();
	}

	
	private boolean isValidProdId(Integer prodyuctId) {
		return prodyuctId!=null && prodyuctId>0;
	}
	private boolean isValidProdCost(Double prodCost) {
		return prodCost!=null && prodCost>0 ;
	}

	private boolean isValidProdDesc(String prodDesc) {
		return prodDesc!=null && (prodDesc.length()>0 && prodDesc.length()<400);
	}
	private boolean isValidProdName(String prodName) {
		return prodName!=null && (prodName.length()>0 && prodName.length()<100);
	}
	
	private boolean isValidProduct(ProductMasterList prod) throws CoronaException{
		boolean isValid=true;
		
		List<String> errMsgs = new ArrayList<>();
		
		if(prod!=null) {
			if(!isValidProdId(prod.getId())) {
				isValid=false;
				errMsgs.add("Product Id must be a positive non-repetative number");
			}
			if(!isValidProdCost(prod.getCost())) {
				isValid=false;
				errMsgs.add("Cost must be a positive and only numbers");
			}
			if(!isValidProdDesc(prod.getProductDescription())) {
				isValid=false;
				errMsgs.add("product description should not be blank");
			}
			if(!isValidProdName(prod.getProductName())) {
				isValid=false;
				errMsgs.add("product name should not be blank");
			}
			
			if(!errMsgs.isEmpty()) {
				throw new CoronaException(errMsgs.toString());
			}
		}else {
			isValid=false;
		}
		
		return isValid;
	}
	@Override
	public ProductMasterList validateAndSave(ProductMasterList productMaster) throws CoronaException {
		if(isValidProduct(productMaster)) {
			productMasterDao.save(productMaster);
		}
		return productMaster;
	}

	@Override
	public boolean deleteProductMaster(Integer productMasterId) throws CoronaException {
		return productMasterDao.deleteById(productMasterId);
	}

	@Override
	public ProductMasterList getProductMaster(Integer productMasterId) throws CoronaException {
		return productMasterDao.getById(productMasterId);
	}

	@Override
	public List<ProductMasterList> getAllProductMasters() throws CoronaException {
		return productMasterDao.getAll();
	}
	@Override
	public ProductMasterList validateAndAdd(ProductMasterList productMaster) throws CoronaException {
		if(isValidProduct(productMaster)) {
			System.out.println("in impl");
			productMasterDao.add(productMaster);
		}
		return productMaster;
	}

}
