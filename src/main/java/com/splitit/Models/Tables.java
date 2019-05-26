package com.splitit.Models;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.QueryHint;
import javax.persistence.Table;

@Entity
@Table(name="tables") // This tells Hibernate to make a table out of this class
	public class Tables {
    		@Id
    		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name = "id")
		private int id;
		@Column(name = "numSeats")
		private int numSeats;
		@Column(name = "seatId")
		private int seatsId;

	
	public int getId() {
		return id;
	}


	public int getnumSeats() {
		return numSeats;
	}

	public void setnumSeats(int numSeats) {
		this.numSeats = numSeats;
	}

	public int getSeatId(int id) {
		return seatsId;
	}
	
	public void setSeatId(int seatId) {
		this.seatsId = seatId;
	}

}
