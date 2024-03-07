package accounts;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class TadAccount {
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	protected String CNPJ;
	protected String officialName;
	protected String publicName;
	protected LocalDate timeOfBirth;

	
	
	public TadAccount(String cNPJ, String officialName, String publicName, LocalDate timeOfBirth) {
		super();
		CNPJ = cNPJ;
		this.officialName = officialName;
		this.publicName = publicName;
		this.timeOfBirth = timeOfBirth;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getOfficialName() {
		return officialName;
	}

	public void setOfficialName(String officialName) {
		this.officialName = officialName;
	}

	public String getPublicName() {
		return publicName;
	}

	public void setPublicName(String publicName) {
		this.publicName = publicName;
	}

	public void setTimeOfBirth(String timeOfBirth) {

		this.timeOfBirth = LocalDate.parse(timeOfBirth, formatter);
	}

	public String getTimeOfBirth() {
		return this.timeOfBirth.format(formatter);
	}

	
	
}
