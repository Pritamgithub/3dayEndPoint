package altimetrik.trip.model;

import java.util.Date;

import lombok.Data;

@Data
public class Result {
	private String destination;
	private Date departureDate;
	private Date returnDate;
	private double price;
	private String airline;
	
	public Result() {
		super();
	}
	
	public Result(String destination, Date departureDate, Date returnDate, double price, String airline) {
		super();
		this.destination = destination;
		this.departureDate = departureDate;
		this.returnDate = returnDate;
		this.price = price;
		this.airline = airline;
	}
	
}
