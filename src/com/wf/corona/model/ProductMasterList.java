package com.wf.corona.model;

public class ProductMasterList {
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductMasterList other = (ProductMasterList) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	private Integer id;
	private String productName;
	private Double cost;
	private String productDescription;
	private Integer availableQuantity;
	private int reqQuantity;
	private Double totalCost;
	private Double totalAmt;
	
	public ProductMasterList() {
		// TODO Auto-generated constructor stub
	}
	
	public ProductMasterList(Integer id, String productName, Double cost, String productDescription,int reqQuantity,String availableQuantity,Double totalCost,Double totalAmt) {
		super();
		this.id = id;
		this.productName = productName;
		this.cost = cost;
		this.productDescription = productDescription;
		this.reqQuantity=reqQuantity;
		this.totalCost=totalCost;
		this.totalAmt = totalAmt;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Integer getQuantity() {
		return availableQuantity;
	}

	public void setQuantity(Integer quantity) {
		this.availableQuantity = quantity;
	}

	public Integer getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(Integer availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public Integer getReqQuantity() {
		return reqQuantity;
	}

	public void setReqQuantity(int reqQuantity) {
		this.reqQuantity = reqQuantity;
	}

	public Double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}

	public Double getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(Double totalAmt) {
		this.totalAmt = totalAmt;
	}

		}

	


