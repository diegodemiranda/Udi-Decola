package repository;

import java.util.List;

import bedrooms.StandardBedrooms;
import bedrooms.VipBedrooms;

public class BankBedrooms {

	List<StandardBedrooms> standard;
	List<VipBedrooms> vip;
	
	void AddStandard(StandardBedrooms bedroom) {
		this.standard.add(bedroom);
	}
	void AddVip(VipBedrooms bedroom) {
		this.vip.add(bedroom);
	}
	//futuramente deve ser mudado para uma função lambda como "public void removeStandardBedroom(int numberBedroom) {
    //standard.removeIf(bedroom -> bedroom.getBedroomNumber().equals(NumberBedroom));}"


	void removeStandard(StandardBedrooms bedroom) {
		this.standard.remove(bedroom);
	}
	void removeStandard(VipBedrooms bedroom) {
		this.vip.remove(bedroom);
	}
}
