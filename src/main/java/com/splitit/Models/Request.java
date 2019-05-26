package com.splitit.Models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.QueryHint;
import javax.persistence.Table;
import javax.persistence.Entity;

@Entity
@Table(name="request") // This tells Hibernate to make a table out of this class
	public class Request {
    		@Id
    		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name = "requestId")
		private int requestId;
		@Column(name = "staffId")
		private int staffId;
		@Column(name = "productId")
		private int productId;
		@Column(name = "seatId")
		private int seatId;
		@Column(name = "tableId")
		private int tableId;
		@Column(name = "isPaid")
		private boolean isPaid;

	
	public int getRequestId() {
		return requestId;
	}


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
