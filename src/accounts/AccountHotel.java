package accounts;

import java.time.LocalDate;
import repository.BankBedrooms;



public class AccountHotel extends TadAccount {

	
	
	protected String fullAdress;
	protected int numberOfStars;
	protected char pets;
	protected int numberOfBedrooms;
	protected LocalDate checkin;
	protected LocalDate checkout;
	protected String publicMessage;
	protected String summary;
	protected BankBedrooms myBedrooms;
	
	public AccountHotel(String cNPJ, String officialName, String publicName, LocalDate timeOfBirth, String fullAdress,
			int numberOfStars, char pets, int numberOfBedrooms, LocalDate checkin, LocalDate checkout,
			String publicMessage, String summary, BankBedrooms myBedrooms) {
		super(cNPJ, officialName, publicName, timeOfBirth);
		this.fullAdress = fullAdress;
		this.numberOfStars = numberOfStars;
		this.pets = pets;
		this.numberOfBedrooms = numberOfBedrooms;
		this.checkin = checkin;
		this.checkout = checkout;
		this.publicMessage = publicMessage;
		this.summary = summary;
		this.myBedrooms = myBedrooms;
	}
	
	
	

}
