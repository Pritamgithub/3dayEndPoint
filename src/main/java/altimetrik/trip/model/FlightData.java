package altimetrik.trip.model;

import java.util.List;

import lombok.Data;

@Data
public class FlightData {
	private String origin;
	private String currency;
	private List<Result> results;

	public FlightData() {
		super();
	}

	public FlightData(String origin, String currency, List<Result> results) {
		super();
		this.origin = origin;
		this.currency = currency;
		this.results = results;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public List<Result> getResults() {
		return results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}
	
	
	
	

}
