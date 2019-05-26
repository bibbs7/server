package com.splitit.Models;

public class RequestData {

	private int staffId;
	private int productId;
	private int seatId;
	private int tableId;
	private boolean isPaid;


	public Integer getstaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public Integer getSeatId() {
		return seatId;
	}

	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}

	public Integer getTableId() {
		return tableId;
	}

	public void setTableId(int tableId) {
		this.tableId = tableId;
	}

	public boolean getStatus(){
		return isPaid;
	}

	public void setStatus(boolean isPaid){
		this.isPaid = isPaid;
	}


}
