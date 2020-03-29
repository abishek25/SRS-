package srs.userstory;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


public class info {

	private String name;
	@NotNull
	@Min(20)
	private Integer identification;
	@NotNull
	@Min(20)
	private Integer trips;
	private String customize;
	private String payment;
	public info()
	{
		
	}
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getTrips() {
		return trips;
	}



	public void setTrips(Integer trips) {
		this.trips = trips;
	}



	public Integer getIdentification() {
		return identification;
	}



	public void setIdentification(Integer identification) {
		this.identification = identification;
	}



	public String getCustomize() {
		return customize;
	}

	public void setCustomize(String customize) {
		this.customize = customize;
	}



	public String getPayment() {
		return payment;
	}



	public void setPayment(String payment) {
		this.payment = payment;
	}
	
}
