package bedrooms;

import java.time.LocalDate;
import java.util.List;

public class StandardBedrooms {
	
	protected TypeBedroom type;
	protected int bedroomNumber;
	protected List<LocalDate> reservedDay;
	protected Double standardPrice;
	protected Double discount;
	
	
	public StandardBedrooms(String type, int bedroomNumber, List<LocalDate> reservedDay, Double standardPrice,
			Double discount) {
		super();
		this.type = TypeBedroom.valueOf(type);
		this.bedroomNumber = bedroomNumber;
		this.reservedDay = reservedDay;
		this.standardPrice = standardPrice;
		//desconto em porcentagem
		this.discount = discount;
	}
	
	
	public TypeBedroom getType() {
		return type;
	}


	public void setType(String type) {
		this.type = TypeBedroom.valueOf(type);
	}


	public int getBedroomNumber() {
		return bedroomNumber;
	}


	public void setBedroomNumber(int bedroomNumber) {
		this.bedroomNumber = bedroomNumber;
	}


	public List<LocalDate> getReservedDay() {
		return reservedDay;
	}


	public void setReservedDay(List<LocalDate> reservedDay) {
		this.reservedDay = reservedDay;
	}


	public Double getStandardPrice() {
		return standardPrice;
	}


	public void setStandardPrice(Double standardPrice) {
		this.standardPrice = standardPrice;
	}


	public Double getDiscount() {
		return discount;
	}


	public void setDiscount(Double discount) {
		this.discount = discount;
	}


	public Double priceBedroom() {
		
		return this.standardPrice;
		
	}
	public Double priceWithDiscount () {
		
		return this.standardPrice *(1-this.discount);
	}
	
	

}
