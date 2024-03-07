package accounts;

import java.time.LocalDate;

public class AccountAirline extends TadAccount{

  public AccountAirline(String cnpj, String officialName, String adName, LocalDate creationDate){
    super(cnpj, officialName, adName, creationDate);
  }

  @Override
  public String toString() {
    return "Airline = {" + "CNPJ = " + getCNPJ() + "; Official name = " + getOfficialName() + "; Advertising name = " + getPublicName() + "; Creation date = " + getTimeOfBirth() + '}';
  }

}
