package bedrooms;

import java.time.LocalDate;
import java.util.List;

public class VipBedrooms extends StandardBedrooms{

	public VipBedrooms(String type, int bedroomNumber, List<LocalDate> reservedDay, Double standardPrice,
			Double discount) {
		super(type, bedroomNumber, reservedDay, standardPrice, discount);
	}

}
